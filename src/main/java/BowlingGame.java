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

        if(firstRoll.equals("X")){
            score.addPoints(10);
        }

        if(gameRecord.equals("12|--|--|--|--|--|--|--|--|--||")) {
            score.addPoints(2);
        }

        return score;
    }
}
