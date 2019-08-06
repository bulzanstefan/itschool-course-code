package ro.itschool.curs17.recursion;

public class FactorialMain {
    public static void main(String[] args) {
        Factorial fa = new Factorial();
        System.out.println(fa.factorial(10));
        System.out.println(fa.factorialWithFor(10));
    }
}
