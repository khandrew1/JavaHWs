// HiddenWordRunner.java - Andrew Khadder

import java.util.Scanner;

public class HiddenWordRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a 5-letter word");

        HiddenWord word = new HiddenWord(scan.nextLine()); // creates HiddenWord object

        System.out.println("Enter Guesses");

        String guess = "";

        // Game Loop
        while (!word.getWord().equals(guess)) { // checks if the user got the word on each iteration
            guess = scan.nextLine(); 
            System.out.println(word.getHint(guess));
        }

        System.out.println("Yes, you got it");

        scan.close();
    }
}
