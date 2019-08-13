package ro.itschool.curs20.prep;

import java.util.function.Function;

public class Example {
    public static void main(String[] args) {
        final Example example = new Example();
        example.printTransform(a -> a.toUpperCase());
        example.printTransform(a -> addSuffix(a));
        example.printTransform(Example::addSuffix);
        example.printTransform(example::anotherSuffix);
    }

    public static String addSuffix(String value) {
        return value + "suffix";
    }

    void printTransform(Function<String, String> logic) {
        System.out.println(logic.apply("hello"));
    }

    public String anotherSuffix(String a) {
        return a + "another";
    }
}
