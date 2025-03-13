package edu.estatuas.brunosbox;

public class PointsDeducted implements Round{

    PointsDeducted(String roundScore){
        this.roundScore = roundScore;
    }

    private final String roundScore;


    byte redBoxerScore = 0;
    byte blueBoxerScore = 0;

    String getRoundScore() {
        return this.roundScore;
    }

    @Override
    public void boxerRoundScore() {
        String redScore = getRoundScore().replace("1,", "").split("-")[0];

        String blueScore = getRoundScore().replace(",1", "").split("-")[1];

        this.redBoxerScore = Byte.parseByte(redScore.trim());
        this.blueBoxerScore = Byte.parseByte(blueScore.trim());
    }

    @Override
    public byte getRedBoxerScore() {
        boxerRoundScore();
        return redBoxerScore;
    }

    @Override
    public byte getBlueBoxerScore() {
        boxerRoundScore();
        return blueBoxerScore;
    }

    @Override
    public String toString(){
        return this.roundScore;
    }
}
