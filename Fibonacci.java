class Fibonacci {
    void print(int n) {
        int a = 0, b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.print(10);
    }
}