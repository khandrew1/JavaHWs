import java.util.ArrayList;
import java.util.Scanner;

public class Merge {

    public static ArrayList<Integer> sort (ArrayList<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            int temp = arr.get(i);
            int pIndex = i;

            while (pIndex > 0 && temp < arr.get(pIndex - 1)) {
                arr.set(pIndex, arr.get(pIndex - 1));
                pIndex--;
            }
            arr.set(pIndex, temp);
        }

        return arr;
    }

    public static ArrayList<Integer> combine(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        ArrayList<Integer> combinedArr = new ArrayList<Integer>();

        for (int i : arr1) {
            combinedArr.add(i);
        }

        for (int i : arr2) {
            combinedArr.add(i);
        }

        return combinedArr;
    }

    public static void createArray(Scanner scan, ArrayList<Integer> arr) {
        int count = 0;

        int input = scan.nextInt();

        while (input >= 0 && arr.size() < 10) {
            arr.add(input);
            input = scan.nextInt();
            if (arr.get(count) > input && input > 0) {
                System.out.println("ERROR: Array not in correct order");
                System.exit(1);
            }
            count++;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        System.out.println("Enter the values for the first array");
        createArray(scan, arr1);

        System.out.println("Enter the values for the second array");
        createArray(scan, arr2);

        ArrayList<Integer> combinedArray = combine(arr1, arr2);

        System.out.println("First Array: " + arr1);
        System.out.println("Second Array: " + arr2);
        System.out.println("Combined Array: " + sort(combinedArray));

        scan.close();
    }
}