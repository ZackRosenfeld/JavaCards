/*
 * Each card has a name, suit, face value, and value
 */
public class Card {
    String name;
    /* 
    *  Full name of the card, including suit and 
    *  value or face. For Example:
    *  ace of hearts
    *  3 of clubs
    */
    char suit;
    /* 
     * 1 letter abbreviation for suit
     * c - clubs
     * s - spades
     * h - hearts
     * d - diamonds
     */
    String faceVal;
    /*
     * value which would be displayed on the card
     * does not change depending on rank
     * ex: two, eight, ace, queen
     */
    int value;
    /* 
     * Integer value of each card 
     * changes depending on which rank is being used
     * EX: for cribbage cards
     * ace = 1
     * jack = 10
     * queen = 10
     * king = 10
    */
    int runValue;
    /*
     * Integer value used for determining runs
     * independent of value
     * example: The value of a king and queen in cribbage are the same but a king is higher than a queen for a run
     */


    // Constructor
    // accepts string of faace value of card
    // ex: "ace", "king", "two"
    // Followed by char representing suit
    // ex: 'd' for "diamonds", 's' for "spades"
    // value and runValue will be assigned based on enum Rank
    public Card(String cardVal, char cardSuit) {
        this.faceVal = cardVal;
        this.suit = cardSuit;
        String fullSuit = "";
        switch(this.suit) {
            case 'h':
                fullSuit = "hearts";
                break;
            case 'd':
                fullSuit = "diamonds";
                break;
            case 's':
                fullSuit = "spades";
                break;
            case 'c':
                fullSuit = "clubs";
                break;
        }

        switch(cardVal.toLowerCase()) {
            case "ace":
                this.value = Rank.ace.getVal();
                this.runValue = Rank.ace.getRunVal();
                break;
            case "two":
                this.value = Rank.two.getVal();
                this.runValue = Rank.two.getRunVal();
                break;
            case "three":
                this.value = Rank.three.getVal();
                this.runValue = Rank.three.getRunVal();
                break;
            case "four":
                this.value = Rank.four.getVal();
                this.runValue = Rank.four.getRunVal();
                break;
            case "five":
                this.value = Rank.five.getVal();
                this.runValue = Rank.five.getRunVal();
                break;
            case "six":
                this.value = Rank.six.getVal();
                this.runValue = Rank.six.getRunVal();
                break;
            case "seven":
                this.value = Rank.seven.getVal();
                this.runValue = Rank.seven.getRunVal();
                break;
            case "eight":
                this.value = Rank.eight.getVal();    
                this.runValue = Rank.eight.getRunVal();
                break;
            case "nine":
                this.value = Rank.nine.getVal();
                this.runValue = Rank.nine.getRunVal();
                break;
            case "ten":
                this.value = Rank.ten.getVal();
                this.runValue = Rank.ten.getRunVal();
                break;
            case "jack":
                this.value = Rank.jack.getVal();
                this.runValue = Rank.jack.getRunVal();
                break;
            case "queen":
                this.value = Rank.queen.getVal();
                this.runValue = Rank.queen.getRunVal();
                break;
            case "king":
                this.value = Rank.king.getVal();
                this.runValue = Rank.king.getRunVal();
                break;
        }        

        this.name = this.faceVal + " of " + fullSuit;
        
    }

    @Override
    public String toString() {
        return this.name;
    }

}