/*
 * the enum Rank is used to assign the integer value to a card corresponding
 * to its face value (for example assigning a value of 1 to ace for cribbage or a 14 for poker)
 * each constant contains one value corresponding to the card.
 */
public enum Rank {
    ace(1, 1),
    two(2, 2),
    three(3, 3),
    four(4, 4),
    five(5, 5),
    six(6, 6),
    seven(7, 7),
    eight(8, 8),
    nine(9, 9),
    ten(10, 10),
    jack(10, 11),
    queen(10, 12),
    king(10, 13);

    private int value;

    private int runValue;

    //constructor
    Rank(int value, int runValue) {
        this.value = value;
        this.runValue = runValue;
    }

    //returnts int value of specified constant
    public int getVal() {
        return this.value;
    }

    //returnts int value of specified constant
    public int getRunVal() {
        return this.runValue;
    }

    // This method sets the value for each rank, ace through king, in order
    public static void setVals(int aceVal, int twoVal, int threeVal, int fourVal, int fiveVal, int sixVal, int sevenVal, 
                                int eightVal, int nineVal, int tenVal, int jackVal, int queenVal, int kingVal) {
        ace.value = aceVal;
        two.value = twoVal;
        three.value = threeVal;
        four.value = fourVal;
        five.value = fiveVal;
        six.value = sixVal;
        seven.value = sevenVal;
        eight.value = eightVal;
        nine.value = nineVal;
        ten.value = tenVal;
        jack.value = jackVal;
        queen.value = queenVal;
        king.value = kingVal;
    }

    // Sets run values for each rank, ace through king, in order
    public static void setRunVals(int aceVal, int twoVal, int threeVal, int fourVal, int fiveVal, int sixVal, int sevenVal, 
    int eightVal, int nineVal, int tenVal, int jackVal, int queenVal, int kingVal) {
        ace.runValue = aceVal;
        two.runValue = twoVal;
        three.runValue = threeVal;
        four.runValue = fourVal;
        five.runValue = fiveVal;
        six.runValue = sixVal;
        seven.runValue = sevenVal;
        eight.runValue = eightVal;
        nine.runValue = nineVal;
        ten.runValue = tenVal;
        jack.runValue = jackVal;
        queen.runValue = queenVal;
        king.runValue = kingVal;
    }
}
