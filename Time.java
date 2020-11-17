import java.util.Scanner;

public class Time {
    public static void main(String arg[]) {

        // Scanner in order to take input from user
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the number of seconds.\n>");

        int userSeconds = scan.nextInt(); // takes user input and puts it in the int variable seconds

        int weeks = userSeconds / (60 * 60  * 24 * 7);

        int days = (userSeconds / (60 * 60 * 24)) % 7; 

        int hours = ((userSeconds / (60 * 60)) % 24);

        int minutes = (userSeconds / 60) % 60;

        int seconds = userSeconds % 60;

        System.out.println(userSeconds + " seconds = " + weeks + " weeks " + days + " days " + hours + " hours " + minutes + " minutes and " +  seconds + " seconds.");

        scan.close();
    }
}