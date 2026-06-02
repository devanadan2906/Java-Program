package oop;

class Addition {

    void sum(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Sum = " + (a + b + c));
    }
}

public class Main {
    public static void main(String[] args) {

        Addition a = new Addition();

        a.sum(10, 20);
        a.sum(10, 20, 30);
    }
}