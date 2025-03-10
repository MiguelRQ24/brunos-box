package edu.estatuas;

public class ScoreCard {

    private final String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    private Byte redBoxerFinalScore = 0;
    private Byte blueBoxerFinalScore = 0;

    private List<Round> rounds = new ArrayList<Round>();

    public ScoreCard(String color) {
        this.color = color;
    }

    public setRCorner(String boxerName) {
        this.redCorner = boxerName;
    }

    public setBCorner(String boxerName) {
        this.blueCorner = boxerName;
    }

    public getNumRounds(){
        return (byte) this.rounds.size();
    }
}
