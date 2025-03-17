package edu.estatuas;

class RegularRound implements Round {

    private final String roundScore;
    private byte redBoxerScore;
    private byte blueBoxerScore;

    public RegularRound(String roundScore) {
        this.roundScore = roundScore.replaceAll("\\s", "");
        this.parseBoxerRoundScore();
    }
    String getRoundScore() {
        return this.roundScore;
    }
    @Override
    public byte getRedBoxerScore() {
        return this.redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        return this.blueBoxerScore;
    }

    @Override
    public String toString() {
        return this.getRedBoxerScore() + " - " + this.getBlueBoxerScore();
    }


}