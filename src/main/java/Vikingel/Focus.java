package Vikingel;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Focus {
    public static ArrayList<Card> readCards(String fname) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fname));
        ArrayList<Card> cardsList = new ArrayList<>();
        while (scanner.hasNext()) {
            String value = scanner.next();
            Card.Suit suit = Card.Suit.valueOf(scanner.next());
            Card c=new Card(value, suit);
            cardsList.add(c);
        }
        return cardsList;
    }
}
