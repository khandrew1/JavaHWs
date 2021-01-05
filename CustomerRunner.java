// CustomerRunner.java - Andrew Khadder

public class CustomerRunner {
    public static void main(String[] args) {
        Customer c1 = new Customer("Smith", 1001);
        Customer c2 = new Customer("Smith", 1002);

        System.out.println(c1.compare(c2));
    }
}