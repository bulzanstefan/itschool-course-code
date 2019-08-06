package ro.itschool.curs17;

public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(3));
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
