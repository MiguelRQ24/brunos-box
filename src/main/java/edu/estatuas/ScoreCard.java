package edu.estatuas;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Collections;


public class ScoreCard {

    private final String color;
    private String redCorner = "";
    private String blueCorner = "";
    private String[] judgeScoreCard;
    private Byte redBoxerFinalScore = 0;
    private Byte blueBoxerFinalScore = 0;

    private List<Round> rounds = new ArrayList<Round>();

    public ScoreCard(String color){
        this.color = color;
    }

    public void setRcorner(String redCorner){
        this.redCorner=boxerName;
    }

    public void setBcorner(String blueCorner){
        this.blueCorner=boxerName;
    }
    public getNumRounds(){
        return (byte) this.rounds.size();
    }

    private void setJudgeScoreCard(String[] scoreCard) {
        this.judgeScoreCard = scoreCard;
    }

    private void addRound(Round round){
        this.rounds.add(round);
    }
    public List<Round> getRounds() {
        return Collections.unmodifiableList(this.rounds);
    }

    private void addRound(Round round) {
        this.rounds.add(round);
    }
}
