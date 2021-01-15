// APLineRunner - Andrew Khadder

public class APLineRunner {
    public static void main(String[] args) {
        APLine line1 = new APLine (5, 4, -17); // creates new AP Line "line1"
        double slope1 = line1.getSlope(); // sets slope1 equal to the slope of line1
        boolean onLine1 = line1.isOnLine (5, -2); // checks if the point (5, -2) is on line1
        
        APLine line2 = new APLine (-25, 40, 30); // creates new AP Line "line2"
        double slope2 = line2.getSlope(); // sets slope2 equal to the slope of line2
        boolean onLine2 = line2.isOnLine (5, -2); // checks if the point (5, -2) is on line2

        System.out.println("Line 1 slope: " + slope1);
        System.out.println("Is the point (5, -2) on Line 1?: " + onLine1);

        System.out.println("Line 2 slope: " + slope2);
        System.out.println("is the point (5, -2) on Line 2?: " + onLine2);
    }
}