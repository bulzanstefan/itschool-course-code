package ro.itschool.curs21.again;

import java.util.ArrayList;
import java.util.List;

interface ListPredicate {
    boolean apply(String name);
}

public class PreJava8 {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        System.out.println(findName(names, "Romeo"));
        System.out.println(findName(names, "Alex"));
        System.out.println(findNameStarting(names, "A"));
        System.out.println(findNameLogic(names, new EqualPredicateAlex()));
        System.out.println(findNameLogic(names, new EqualPredicate("Romeo")));
        System.out.println(findNameLogic(names, new StartsWithPredicate("D")));
        System.out.println(findNameLogic(names, new ListPredicate() {
            @Override
            public boolean apply(String name) {
                return name.length() == 4;
            }
        }));
    }

    private static List<String> findNameLogic(List<String> names, ListPredicate predicate) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (predicate.apply(name)) {
                result.add(name);
            }
        }
        return result;
    }

    private static List<String> findNameStarting(List<String> names, String prefix) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.startsWith(prefix)) {
                result.add(name);
            }
        }
        return result;
    }

    private static List<String> findName(List<String> names, String nameToLook) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (name.equals(nameToLook)) {
                result.add(name);
            }
        }
        return result;
    }


}

class StartsWithPredicate implements ListPredicate {
    private final String prefix;

    public StartsWithPredicate(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean apply(String name) {
        return name.startsWith(prefix);
    }
}

class EqualPredicateAlex implements ListPredicate {
    @Override
    public boolean apply(String name) {
        return name.equals("Alex");
    }
}

class EqualPredicate implements ListPredicate {
    private final String template;

    public EqualPredicate(String template) {
        this.template = template;
    }

    @Override
    public boolean apply(String name) {
        return template.equals(name);
    }
}
