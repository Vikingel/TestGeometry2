package Vikingel;

import java.util.Objects;

public class Card {
    String value;
    public enum Suit {

        SPADES,
        CLUBS,
        DIAMONDS,
        HEARTS

    }
    public Suit suit;
    public Card(String value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
@Override
    public String toString() {
        return "Card{" +
                "value = " + value +
                ", suit = " + suit +
                              '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(value, card.value) && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, suit);
    }
}