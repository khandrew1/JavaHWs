// Triangle.java - Andrew Khadder
// Given 3 doubles, determines what type of triangle it is.

import java.util.Scanner;

public class Triangle {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter the x and y coordinates of point 1 (separated by space)\n>");

        double x1 = scan.nextDouble(); // takes the first digit the user input
        double y1 = scan.nextDouble(); // takes the second digit the user input

        System.out.print("Please enter the x and y coordinates of point 2 (separated by space)\n>");

        double x2 = scan.nextDouble(); // takes the first digit the user input 
        double y2 = scan.nextDouble(); // takes the second digit the user input 

        System.out.print("Please enter the x and y coordinates of point 3 (separated by space)\n>");

        double x3 = scan.nextDouble(); // takes the first digit the user input
        double y3 = scan.nextDouble(); // takes the second digit the user input

        double side1 = Math.round((((Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)))) * 100.0) / 100.0); // set side1 equal to the distance between points and fixed rounding error.
        double side2 = Math.round((((Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2)))) * 100.0) / 100.0); // set side2 equal to the distance between points and fixed rounding error.
        double side3 = Math.round((((Math.sqrt(Math.pow((x3-x2),2) + Math.pow((y3-y2),2)))) * 100.0) / 100.0); // set side3 equal to the distance between points and fixed rounding error.

        if (side1 == side2 && side2 == side3 && side3 == side1) { 
            System.out.println("This is an equilateral triangle");
        } else if ((side1 == side2 && side2 != side3) || (side2 == side3 && side2 != side1) || (side3 == side1 && side3 != side2)) {
            System.out.println("This is an isoceles triangle"); 
        } else {
            System.out.println("This is a scalene triangle");
        }

        scan.close(); 
    }
}