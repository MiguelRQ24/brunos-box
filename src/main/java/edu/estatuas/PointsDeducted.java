package edu.estatuas;

class PointsDeducted implements Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    PointsDeducted(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
    }
}