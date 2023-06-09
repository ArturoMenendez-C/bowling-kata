public class Score {
    private int points;

    public Score() {
        this.points = 0;
    }

    public void addPoints(Roll newRoll) {
        points += newRoll.getPinsHit();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Score score = (Score) o;
        return points == score.points;
    }

    @Override
    public String toString() {
        return "Score{ " +
                "points=" + points +
                " }";
    }
}
