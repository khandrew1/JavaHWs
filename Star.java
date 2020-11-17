import java.util.Scanner;

public class Star {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        String stars = "";

        System.out.print("Please enter a number less than 20\n>");

        int num1 = scan.nextInt();

        if (num1 < 20) {
            for (int i = 0; i < num1; i++) {
                stars += "*";
                System.out.println(stars);
            }
        } else {
            System.out.println("error");
        }
        scan.close();
    }
}