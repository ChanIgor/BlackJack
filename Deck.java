public enum Deck {
    ACE_SPADES("SPADES", "ACE", 11),
    ACE_CLUBS("CLUBS", "ACE", 11),
    ACE_DIAMONDS("DIAMONDS", "ACE", 11),
    ACE_HEARTS("HEARTS", "ACE", 11),
    KING_SPADES("SPADES", "KING", 10),
    KING_CLUBS("CLUBS", "KING", 10),
    KING_DIAMONDS("DIAMONDS", "KING", 10),
    KING_HEARTS("HEARTS", "KING", 10),
    QUEEN_SPADES("SPADES", "QUEEN", 10),
    QUEEN_CLUBS("CLUBS", "QUEEN", 10),
    QUEEN_DIAMONDS("DIAMONDS", "QUEEN", 10),
    QUEEN_HEARTS("HEARTS", "QUEEN", 10),
    JACK_SPADES("SPADES", "JACK", 10),
    JACK_CLUBS("CLUBS", "JACK", 10),
    JACK_DIAMONDS("DIAMONDS", "JACK", 10),
    JACK_HEARTS("HEARTS", "JACK", 10),
    NINE_SPADES("SPADES", "NINE", 9),
    NINE_CLUBS("CLUBS", "NINE", 9),
    NINE_DIAMONDS("DIAMONDS", "NINE", 9),
    NINE_HEARTS("HEARTS", "NINE", 9),
    EIGHT_SPADES("SPADES", "EIGHT", 8),
    EIGHT_CLUBS("CLUBS", "EIGHT", 8),
    EIGHT_DIAMONDS("DIAMONDS", "EIGHT", 8),
    EIGHT_HEARTS("HEARTS", "EIGHT", 8),
    SEVEN_SPADES("SPADES", "SEVEN", 7),
    SEVEN_CLUBS("CLUBS", "SEVEN", 7),
    SEVEN_DIAMONDS("DIAMONDS", "SEVEN", 7),
    SEVEN_HEARTS("HEARTS", "SEVEN", 7),
    SIX_SPADES("SPADES", "SIX", 6),
    SIX_CLUBS("CLUBS", "SIX", 6),
    SIX_DIAMONDS("DIAMONDS", "SIX", 6),
    SIX_HEARTS("HEARTS", "SIX", 6),
    FIVE_SPADES("SPADES", "FIVE", 5),
    FIVE_CLUBS("CLUBS", "FIVE", 5),
    FIVE_DIAMONDS("DIAMONDS", "FIVE", 5),
    FIVE_HEARTS("HEARTS", "FIVE", 5),
    FOUR_SPADES("SPADES", "FOUR", 4),
    FOUR_CLUBS("CLUBS", "FOUR", 4),
    FOUR_DIAMONDS("DIAMONDS", "FOUR", 4),
    FOUR_HEARTS("HEARTS", "FOUR", 4),
    THREE_SPADES("SPADES", "THREE", 3),
    THREE_CLUBS("CLUBS", "THREE", 3),
    THREE_DIAMONDS("DIAMONDS", "THREE", 3),
    THREE_HEARTS("HEARTS", "THREE", 3);
    private final String name;
    private final String suit;
    private final int value;

    Deck(String name, String suit, int value){
        this.name = name;
        this.suit = suit;
        this.value = value;
    }
    String getName(){
        return name;
    }
    String getSuit(){
        return suit;
    }
    int getValue(){
        return value;
    }


}
