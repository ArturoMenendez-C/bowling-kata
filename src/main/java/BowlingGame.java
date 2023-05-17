public class BowlingGame {

    private final Score score;

    public BowlingGame(Score score) {
        this.score = score;
    }

    public Score calculateScore(String gameRecord) {

        String firstRoll = gameRecord.split("")[0];

        if (!firstRoll.equals("-")) {
            int firstRollPoints = Integer.parseInt(firstRoll);
            score.addPoints(firstRollPoints);
        }

        return score;
    }
}
