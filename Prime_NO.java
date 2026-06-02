class Prime {
    void check(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count++;
        }

        if (count == 2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

public class Main {
    public static void main(String[] args) {
        Prime p = new Prime();
        p.check(7);
    }
}