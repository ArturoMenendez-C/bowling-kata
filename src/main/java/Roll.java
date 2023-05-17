public class Roll {
    private String pins;

    Roll(String pins) {
        this.pins = pins;
    }

    public boolean isMiss() {
        return pins.equals("-");
    }

    public boolean isStrike() {
        return pins.equals("X");
    }

    public boolean isEndOfFrame() {
        return pins.equals("|");
    }

    public int getPinsHit() {
        int pinsHit = 0;

        if (!this.isMiss() && !this.isStrike() && !this.isEndOfFrame()) {
            pinsHit = Integer.parseInt(this.pins);
        }

        if(this.isStrike()) {
            pinsHit = 10;
        }

        return pinsHit;
    }
}
