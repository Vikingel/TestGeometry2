import Vikingel.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static Vikingel.Focus.readCards;

public class CardsTest {
@Test
   public void testReading() throws FileNotFoundException {
   String fname = "cardsList.txt";
   ArrayList<Card> cards = readCards(fname);
   Card c1=new Card("Valet", Card.Suit.SPADES);
   Card c2=new Card("Dama", Card.Suit.HEARTS);
   ArrayList<Card> cardsNew=new ArrayList<>();
   cardsNew.add(c1);
   cardsNew.add(c2);
   Assertions.assertEquals(cardsNew,cards);
}

}