package edu.estatuas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.estatuas.brunosbox.ScoreCard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScoreCardTest {

    private ScoreCard card;

    private final String[] whiteScoreCard =  {"9 - 10",
            "9 - 10",
            "9 - 10",
            "9 - 10",
            "10 - 9",
            "10 - 9",
            "10 - 9",
            "9 - 10",
            "10 - 9",
            "9 - 10"};

    private final String[] pinkScoreCard = {"9 - 10",
            "9 - 10",
            "9 - 10",
            "1, 8 - 10", // referee point deduction
            "10 - 8",    // knockdown
            "10 - 8 ,1", // referee point deduction
            "10 - 9",
            "9 - 10",
            "10 - 9",
            "10 - 8"}; // knockdown

    @BeforeEach
    public void setup() {
        card = new ScoreCard("white");
    }

    @Test
    void testClassInitialization(){
        assertEquals("white", card.getColor());
    }

}