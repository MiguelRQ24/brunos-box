package edu.estatuas.brunosbox;

public class RoundFactory {

    public static Round getRound(String roundScore) {
        if (roundScore.contains("8")){
            if (roundScore.contains("1,") || roundScore.contains(",1")) {
                return new PointsDeducted(roundScore);

            }
            else{
                return new KnockdownRound(roundScore);
            }
        }
        else{
            return new RegularRound(roundScore);
        }
    }
}
