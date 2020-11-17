import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a word, phrase, or sentence\n>");

        String str1 = scan.nextLine();

        String lowerCaseStr = str1.toLowerCase(); // sets the string to lower case in order to compare

        String compareStr = ""; // empty string in order to remove spaces and special characters

        String backwardsStr = ""; // empty string in order to have the string in reverse.

        String c;

        for (int i = 0; i < lowerCaseStr.length(); i++) { // starts from beginning of the string and goes to end
            c = lowerCaseStr.substring(i, i + 1); // sets c to one char substring for readability
            if (!(c.equals(" ")) && ((c.compareTo("a") >= 0) && c.compareTo("z") <= 0)) { // checks if c is a space or a special character, if neither it gets added to compareStr
                compareStr += lowerCaseStr.substring(i, i + 1);
            }
        }

        for (int i = lowerCaseStr.length() - 1; i >= 0; i--) { // starts from end of the string and goes to beginning
            c = lowerCaseStr.substring(i, i + 1); // sets c to one char substring for readability
            if (!(c.equals(" ")) && ((c.compareTo("a") >= 0) && c.compareTo("z") <= 0)) { // checks if c is a space or special character, if neither it gets added to backwardsStr
                backwardsStr += lowerCaseStr.substring(i, i + 1);
            }
        }

        if (compareStr.equals(backwardsStr)) { // compares compareStr and backwardsStr to see if they are equal
            System.out.println("\"" + str1 + "\"" + " is a palindrome.");
        } else {
            System.out.println("\"" + str1 + "\"" + " is not a palindrome.");
        }

        scan.close();
    }
}