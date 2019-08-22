package ro.itschool.curs21;

import java.util.ArrayList;
import java.util.List;

interface ListPredicate {
    boolean applyCondition(String name);
}

public class PreJava8 {

    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        System.out.println(findName(names, new EqualPredicate("Adrian")));
        System.out.println(findName(names, new StartWithPredicate("A")));

        System.out.println(findName(names, new ListPredicate() {
            @Override
            public boolean applyCondition(String name) {
                return name.equals("Adrian");
            }
        }));
    }

    private static List<String> findName(List<String> names, ListPredicate predicate) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (predicate.applyCondition(name)) {
                result.add(name);
            }
        }
        return result;
    }

    private static class StartWithPredicate implements ListPredicate {
        private final String prefix;

        public StartWithPredicate(String prefix) {
            this.prefix = prefix;
        }

        @Override
        public boolean applyCondition(String name) {
            return name.startsWith(prefix);
        }
    }
}

class EqualPredicate implements ListPredicate {
    private final String lookup;

    public EqualPredicate(String lookup) {
        this.lookup = lookup;
    }

    @Override
    public boolean applyCondition(String name) {
        return lookup.equals(name);
    }
}
