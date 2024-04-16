package Vikingel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static Vikingel.Focus.readCards;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
test1();

    }

    private static void test1() throws FileNotFoundException {
        String fname = "cardsList.txt";
        ArrayList<Card> cards = readCards(fname);
        System.out.println(cards);

    }

}

