package hw.algoritms;

import java.util.ArrayList;
import java.util.List;

public class AlphabetPrinter {
    public static void main(String[] args) {
        //65 - 90
        List<Character> alphabet = new ArrayList<>();

        int i = 65;

        while(i <= 90){
            alphabet.add((char) i);
            i++;
        }

        for (Character c : alphabet) {
            System.out.print(c);
        }
    }
}