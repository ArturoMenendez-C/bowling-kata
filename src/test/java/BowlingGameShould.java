import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameShould {

    @Test
    void score_is_zero_when_no_pins_down_in_the_whole_game() {
        BowlingGame bowlingGame = new BowlingGame();
        int expectedScore = 0;

        int gameScore = bowlingGame.calculateScore("--|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }

    @Test
    void score_is_one_when_one_pin_down_in_the_whole_game() {
        BowlingGame bowlingGame = new BowlingGame();
        int expectedScore = 1;

        int gameScore = bowlingGame.calculateScore("1-|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }

    @Test
    void score_is_two_when_two_pins_down_in_the_whole_game() {
        BowlingGame bowlingGame = new BowlingGame();
        int expectedScore = 2;

        int gameScore = bowlingGame.calculateScore("2-|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }

    @Test
    void score_is_three_when_three_pins_down_in_the_whole_game() {
        BowlingGame bowlingGame = new BowlingGame();
        int expectedScore = 3;

        int gameScore = bowlingGame.calculateScore("3-|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }

}
