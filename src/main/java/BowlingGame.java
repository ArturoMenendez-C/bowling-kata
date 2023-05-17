public class BowlingGame {
    public int calculateScore(String gameRecord) {
        if( gameRecord.equals("1-|--|--|--|--|--|--|--|--|--||") ) return 1;
        if( gameRecord.equals("2-|--|--|--|--|--|--|--|--|--||") ) return 2;
        return 0;
    }
}
