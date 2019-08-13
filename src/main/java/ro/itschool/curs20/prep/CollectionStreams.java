package ro.itschool.curs20.prep;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class CollectionStreams {
    public static void main(String[] args) {
        List<String> names = List.of("Dragos", "Mircea", "Ionut", "Florin", "Horea", "Daniel");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("D"))
                .collect(toList());

        final List<Person> persons = List.of(
                new Person("Dragos", "Oradea", 20, 167),
                new Person("Mihai", "Cluj-Napoca", 26, 167),
                new Person("Ionel", "Brasov", 21, 167),
                new Person("Oana", "Oradea", 30, 167),
                new Person("Serban", "Oradea", 40, 167),
                new Person("Catalin", "Bucurest", 42, 167),
                new Person("Ioana", "Orsova", 44, 167),
                new Person("Mihaela", "Oradea", 13, 167),
                new Person("Ana", "Bucuresti", 28, 167),
                new Person("Bogdan", "Cluj-Napoca", 87, 167)
        );
        persons.stream()
                .sorted(Comparator.comparingInt(Person::getAge).reversed())
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
