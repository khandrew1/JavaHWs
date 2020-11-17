import java.util.Scanner;

public class Average {
  public static void main(String arg[]){
    
    // scanner in order to read user input
    Scanner scan = new Scanner(System.in);
    
    // variables to hold the test scores
    int test1;
    int test2;
    
    // variables to hold the quiz scores
    int quiz1;
    int quiz2;
    int quiz3;
    
    // variable to hold the homework average
    double hwAverage;
    
    // variables to hold the test and quiz averages
    double testAverage;
    double quizAverage;
    
    // variable to hold the final grade
    double finalGrade;
    
    System.out.println("Please enter your test grades.");
    
    System.out.print("Test 1>");
    
    test1 = scan.nextInt(); // asks the user for their first test score
    
    System.out.print("Test 2>");
    
    test2 = scan.nextInt(); // asks the user for their second test score
    
    System.out.println("\nPlease enter your quiz grades.");
    
    System.out.print("Quiz 1>");

    quiz1 = scan.nextInt(); // asks the user for their first quiz score

    System.out.print("Quiz 2>");

    quiz2 = scan.nextInt(); // asks the user for their second quiz score

    System.out.print("Quiz 3>");

    quiz3 = scan.nextInt(); // asks the user for their third quiz score

    System.out.println("\nPlease enter your homework average.");

    System.out.print("Homework >");

    hwAverage = scan.nextDouble(); // asks the user for their hw average

    testAverage = (double)(test1 + test2) / 2; // calculates test average

    quizAverage = (double)(quiz1 + quiz2 + quiz3) / 3; // calculates quiz average

    finalGrade = (testAverage * 0.5) + (quizAverage * 0.3) + (hwAverage * 0.2); // calculates final grade

    System.out.println("\n>Test Average: " + testAverage); // prints test average
    System.out.println(">Quiz Average: " + quizAverage); // prints quiz averae
    System.out.println(">Final Grade: " + finalGrade); // prints final grade

    scan.close();
  }
}