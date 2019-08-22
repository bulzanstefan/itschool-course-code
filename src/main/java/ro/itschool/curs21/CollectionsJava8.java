package ro.itschool.curs21;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsJava8 {
    public static void main(String[] args) {
        List<String> names = List.of("Adrian", "Romeo", "Alex", "Darius");

        names.forEach(name -> System.out.println(name));

        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));

        final List<Person> people = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(name -> new Person(name))
                .collect(Collectors.toList());
        System.out.println(people);
    }

}

