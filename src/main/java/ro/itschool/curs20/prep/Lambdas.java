package ro.itschool.curs20.prep;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> f = p -> {
            return p;
        };
    }
}
