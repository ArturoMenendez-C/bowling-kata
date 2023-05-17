import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameShould {

    private static Stream<Arguments> firstRollPinsDownCase () {
        String firstRollFormat = "-|--|--|--|--|--|--|--|--|--||";
        return Stream.of(
                Arguments.of("1", "1" + firstRollFormat),
                Arguments.of("2", "2" + firstRollFormat),
                Arguments.of("3", "3" + firstRollFormat)
        );
    }

    @Test
    void score_is_zero_when_no_pins_down_in_the_whole_game() {
        BowlingGame bowlingGame = new BowlingGame(new Score());
        Score expectedScore = new Score();

        Score gameScore = bowlingGame.calculateScore("--|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }

    @ParameterizedTest
    @MethodSource("firstRollPinsDownCase")
    void score_is_one_when_one_pin_down_in_the_whole_game(String pins, String gameRecord) {
        BowlingGame bowlingGame = new BowlingGame(new Score());
        Score expectedScore = new Score();

        expectedScore.addPoints(new Roll(pins));
        Score gameScore = bowlingGame.calculateScore(gameRecord);

        assertEquals(expectedScore, gameScore);
    }

    @Test
    void score_is_ten_when_first_roll_is_strike() {
        BowlingGame bowlingGame = new BowlingGame(new Score());
        Score expectedScore = new Score();

        expectedScore.addPoints(new Roll("10"));
        Score gameScore = bowlingGame.calculateScore("X|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }
    @Test
    void score_is_three_when_first_two_rolls_add_three() {
        BowlingGame bowlingGame = new BowlingGame(new Score());
        Score expectedScore = new Score();

        expectedScore.addPoints(new Roll("3"));
        Score gameScore = bowlingGame.calculateScore("12|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }

    @Test
    void score_is_seven_when_first_two_rolls_add_seven() {
        BowlingGame bowlingGame = new BowlingGame(new Score());
        Score expectedScore = new Score();

        expectedScore.addPoints(new Roll("7"));
        Score gameScore = bowlingGame.calculateScore("52|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }

    @Test
    void score_is_nine_when_first_two_rolls_add_nine() {
        BowlingGame bowlingGame = new BowlingGame(new Score());
        Score expectedScore = new Score();

        expectedScore.addPoints(new Roll("9"));
        Score gameScore = bowlingGame.calculateScore("36|--|--|--|--|--|--|--|--|--||");

        assertEquals(expectedScore, gameScore);
    }
}
