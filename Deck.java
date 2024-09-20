/*
 * Deck is a subclass of Stack. the only difference is the constructor, which will automatically
 * add the 52 cards of a standard deck to the list stackCards and the class method rebuildDeck, which will 
 * clear the deck and then add the standard 52 cards back to the deck
 */
public class Deck extends Stack {

    // Constructor
    // names the deck and adds the 52 cards in a standard deck
    public Deck(String name) {
        super(name); // calling the constructor of the superclass, in this case Stack
        
        char[] suits = {'h', 'd', 's', 'c'};
        String[] faceValues = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};

        for (char suit : suits) {
            for (String faceValue : faceValues) {
                Card card = new Card(faceValue, suit);
                this.stackCards.add(card);
            }
        }    
        
    }

    public void rebuildDeck() {
        this.stackCards.clear();

        char[] suits = {'h', 'd', 's', 'c'};
        String[] faceValues = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};

        for (char suit : suits) {
            for (String faceValue : faceValues) {
                Card card = new Card(faceValue, suit);
                this.stackCards.add(card);
            }
        }    
        
    }

}
