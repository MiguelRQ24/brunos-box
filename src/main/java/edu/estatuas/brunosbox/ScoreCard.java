package edu.estatuas.brunosbox;


import static edu.estatuas.brunosbox.RoundFactory.getRound;

public class ScoreCard {
    private final String color;
    private String rCorner;
    private String bCorner;
    private String[] judgeScoreCard;
    Round[] rounds;
    int numRounds;
    public ScoreCard(String color){
        this.color = color;
    }

    void setRCorner(String boxerName){
        this.rCorner = boxerName;
    }

    void setBCorner(String boxerName){
        this.bCorner = boxerName;
    }

    public String getRCorner() {
        return rCorner;
    }

    public String getBCorner() {
        return bCorner;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfRounds() {
        if (judgeScoreCard != null){ this.numRounds = judgeScoreCard.length;}
        return numRounds;
    }

    @Override
    public String toString() {
        return  "                     "/*4,5 tabs*/ + getColor() + "\n" +
                "          "/*2,5 tabs*/ + getRCorner() + "    "/*4 espacios*/ + getBCorner() + "\n" +
                "                   " + getNumberOfRounds() + " Rounds" + "\n" +
                "Round    Total       ROUND       Total    Round" + "\n" +
                "Score    Score                   Score    Score" + "\n" +
                viewRounds();
    }

    void loadJudgeScoreCard(String[] judgeScoreCard){
        this.judgeScoreCard = judgeScoreCard;
        setRounds(judgeScoreCard);
    }

    private void setRounds(String[] judgeScoreCard) {
        int i = 0;
        rounds = new Round[judgeScoreCard.length];
        for (String roundPuntuation: judgeScoreCard){
            Round round = getRound(roundPuntuation);
            rounds[i] = round;
            i++;
        }

    }
    String viewRounds(){
        if (rounds == null){return "";}
        StringBuilder results = new StringBuilder();
        int redTotalPoints = 0;
        int blueTotalPoints = 0;
        for (Round round: rounds){
            results.append(
                            round.getRedBoxerScore() + "\t\t\s" + (redTotalPoints += round.getRedBoxerScore()) +
                            "\t\t\s\s\s\s" +
                            round.getRedBoxerScore() + " - " + round.getBlueBoxerScore() +
                            "\t\t\s" +
                            (blueTotalPoints += round.getBlueBoxerScore())+ "\t\t\s" + round.getBlueBoxerScore()  + "\n"
                            );
        }

        return results.toString();
    }
}
