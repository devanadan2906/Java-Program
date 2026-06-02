class PalindromeNumber {
    void check(int n) {
        int temp = n;
        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeNumber p = new PalindromeNumber();
        p.check(121);
    }
}