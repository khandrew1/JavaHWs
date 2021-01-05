// Customer.java - Andrew Khadder

public class Customer {
    private String name;
    private int idNum;

    // Constructs a Customer with given name and ID number
    public Customer (String name, int idNum) {
        this.name = name;
        this.idNum = idNum;
    }

    // returns the customer's name
    public String getName() {
        return name;
    }

    // returns the customer's id
    public int getID() {
        return idNum;
    }

    // returns a string of "Customer name: <name>   id: <idNum>"
    public String toString() {
        return "Customer name: " + name + "\tid: " + idNum;
    }

    /*  returns:
        1 if this customer is greater than other
        -1 if this customer is less than the other
        0 if they are the same
    */
    public int compare(Customer other) {
        if (other.idNum > idNum) {
            return -1;
        } else if (other.idNum < idNum) {
            return 1;
        } else {
            return 0;
        }
    }
}