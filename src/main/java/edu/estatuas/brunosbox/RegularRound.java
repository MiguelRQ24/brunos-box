package edu.estatuas.brunosbox;

public class RegularRound implements Round{
    private String roundScore;


    byte redBoxerScore = 0;
    byte blueBoxerScore = 0;

    RegularRound(String roundScore){
        this.roundScore = roundScore;
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

    String getRoundScore() {
        return this.roundScore;
    }

    @Override
    public void boxerRoundScore(){
        String redScore = getRoundScore().split("-")[0];

        String blueScore = getRoundScore().split("-")[1];

        this.redBoxerScore = Byte.parseByte(redScore.trim());
        this.blueBoxerScore = Byte.parseByte(blueScore.trim());
    }


}
