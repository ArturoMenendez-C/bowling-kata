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
                Arguments.of(1, "1" + firstRollFormat),
                Arguments.of(2, "2" + firstRollFormat),
                Arguments.of(3, "3" + firstRollFormat)
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
    void score_is_one_when_one_pin_down_in_the_whole_game(int points, String gameRecord) {
        BowlingGame bowlingGame = new BowlingGame(new Score());
        Score expectedScore = new Score();

        expectedScore.addPoints(points);
        Score gameScore = bowlingGame.calculateScore(gameRecord);

        assertEquals(expectedScore, gameScore);
    }
}
