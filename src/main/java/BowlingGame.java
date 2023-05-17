public class BowlingGame {

    private final Score score;

    public BowlingGame(Score score) {
        this.score = score;
    }

    public Score calculateScore(String gameRecord) {

        String firstRoll = gameRecord.split("")[0];

        if (!firstRoll.equals("-") && !firstRoll.equals("X")) {
            int firstRollPoints = Integer.parseInt(firstRoll);
            score.addPoints(firstRollPoints);
        }

        if (firstRoll.equals("X")){
            score.addPoints(10);
        }

        String secondRoll = gameRecord.split("")[1];

        if (!secondRoll.equals("-") && !secondRoll.equals("|")) {
            int secondRollPoints = Integer.parseInt(secondRoll);
            score.addPoints(secondRollPoints);
        }

        return score;
    }
}
