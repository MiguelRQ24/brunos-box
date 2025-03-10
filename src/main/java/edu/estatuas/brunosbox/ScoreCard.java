package edu.estatuas.brunosbox;

public class ScoreCard {
    private final String color;
    private String rCorner;
    private String bCorner;
    private String[] judgeScoreCard;
    int rounds;
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

    public int getRounds() {
        if (judgeScoreCard != null){ this.rounds = judgeScoreCard.length;}
        return rounds;
    }

    @Override
    public String toString() {
        return  "                     "/*4,5 tabs*/ + getColor() + "\n" +
                "          "/*2,5 tabs*/ + getRCorner() + "    "/*4 espacios*/ + getBCorner() + "\n" +
                "                   " + getRounds() + " Rounds" + "\n" +
                "Round    Total       ROUND       Total    Round" + "\n" +
                "Score    Score                   Score    Score";
    }

    void loadJudgeScoreCard(String[] judgeScoreCard){
        this.judgeScoreCard = judgeScoreCard;
    }
}
