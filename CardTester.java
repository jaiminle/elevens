package elevenslabjl;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

    /**
     * The main method in this class checks the Card operations for consistency.
     *
     * @param args is not used.
     */
    public static void main(String[] args) {

        //Creating three new card objects
        Card card1 = new Card("Queen", "Diamonds", 12);
        Card card2 = new Card("King", "Hearts", 13);
        Card card3 = new Card("Queen", "Diamonds", 12);

        /*
         * Testing each method for each Card objects
         */
        System.out.println("=== Display each Card object ===");
        //Return Card1 information
        System.out.println("Card1");
        System.out.println(">>Rank: " + card1.rank);
        System.out.println(">>Suit: " + card1.suit);
        System.out.println(">>Point Value: " + card1.pointValue);
        System.out.println(card1.toString());

        //Return Card2 information
        System.out.println("\nCard2");
        System.out.println(">>Rank: " + card2.rank);
        System.out.println(">>Suit: " + card2.suit);
        System.out.println(">>Point Value: " + card2.pointValue);
        System.out.println(card2.toString());

        //Return Card3 information
        System.out.println("\nCard3");
        System.out.println(">>Rank: " + card3.rank);
        System.out.println(">>Suit: " + card3.suit);
        System.out.println(">>Point Value: " + card3.pointValue);
        System.out.println(card3.toString());

        //match
        System.out.println("\n\n=== Match ===");
        System.out.print("Does card1 match card2? ");
        if (card1.matches(card2) == true) {
            System.out.println("Yes they do match.");
        } else {
            System.out.println("No they don't match.");
        }

        System.out.print("Does card1 match card3? ");
        if (card1.matches(card3) == true) {
            System.out.println("Yes they do match.");
        } else {
            System.out.println("No they don't match.");
        }

        System.out.print("Does card2 match card3? ");
        if (card2.matches(card3) == true) {
            System.out.println("Yes they do match.");
        } else {
            System.out.println("No they don't match.");
        }

    }
}
