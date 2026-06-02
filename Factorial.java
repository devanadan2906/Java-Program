class Factorial {
    void calc(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}

public class Main {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.calc(5);
    }
}