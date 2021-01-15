// APLine.java - Andrew Khadder

public class APLine {
    
    int a;
    int b;
    int c;
    
    public APLine(int a, int b, int c) {
        if (a != 0) {
            this.a = a;
        } else {
            this.a = 1;
        }
        if (b != 0) {
            this.b = b;
        } else {
            this.b = 1;
        }
        this.c = c;
    }

    public double getSlope() {
        return (double) -a / b;
    }

    public boolean isOnLine(int x, int y) {
        int answer = (a * x) + (b * y) + (c);

        if (answer == 0) {
            return true;
        } else {
            return false;
        }
    }
}