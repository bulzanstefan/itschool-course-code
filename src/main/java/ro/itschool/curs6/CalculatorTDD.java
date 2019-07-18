package ro.itschool.curs6;

public class CalculatorTDD {
    public int add(int termen1, int termen2) {
        return termen1 + termen2;
    }

    public int div(int a, int b) {
        return b == 0 ? 0 : a / b;
    }
}
