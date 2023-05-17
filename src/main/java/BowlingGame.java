public class BowlingGame {

    private final Score score;

    public BowlingGame(Score score) {
        this.score = score;
    }

    public Score calculateScore(String match) {

        Roll firstRoll = new Roll(match.split("")[0]);
        score.addPoints(firstRoll);

        Roll secondRoll = new Roll(match.split("")[1]);
        score.addPoints(secondRoll);

        return score;
    }
}
