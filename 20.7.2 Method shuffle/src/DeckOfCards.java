//  Fig. 20.10: DeckOfCards.java
//  Card shuffle and dealing with Collections method shuffle

//  class to represent a Card in a deck of cards
class Card
{
    public static enum Face{Ace, Deuce, Three, Four, Five, Six,
        Seven, Eight, Nine, Ten, Jack, Queen, King };

    public static enum Suit {Club, Diamonds, Heart, Spades};

    private final Face face;    //  face of card
    private final Suit suit;    //  suit of card

}
