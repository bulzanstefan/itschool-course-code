package ro.itschool.curs21;

import java.util.ArrayList;
import java.util.List;

interface ListPredicate2 {

    boolean apply(String name);
}

public class PreJava8_2 {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        System.out.println(findName(names, new EqualPredicate2("Adrian")));
        System.out.println(findName(names, new StartsWithPredicate2("Adrian")));
        System.out.println(findName(names, new ListPredicate2() {
            @Override
            public boolean apply(String name) {
                return name.equals("Adrian");
            }
        }));
    }

    private static List<String> findName(List<String> names, ListPredicate2 predicate) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (predicate.apply(name)) {
                result.add(name);
            }
        }
        return result;
    }


}

class StartsWithPredicate2 implements ListPredicate2 {
    private final String prefix;

    public StartsWithPredicate2(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean apply(String name) {
        return name.startsWith(prefix);
    }
}

class EqualPredicate2 implements ListPredicate2 {
    private final String name;

    public EqualPredicate2(String name) {
        this.name = name;
    }

    @Override
    public boolean apply(String name) {
        return false;
    }
}
