// Fib.java - Andrew Khadder
// prints out the first 45 numbers of the fibonacci sequence

public class Fib {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int num3;
        int num4;
        int num5;

        int count = 0;

        while (count <= 8) {

            num3 = num2 + num1;
            num4 = num3 + num2;
            num5 = num4 + num3;
            System.out.print(num1 + " " + num2 + " " + num3 +  " " + num4 + " " + num5 + "\n");
            num1 = num4 + num5;
            num2 = num1 + num5;
            count++;

        }
    }
}