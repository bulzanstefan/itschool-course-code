package ro.itschool.curs10.persons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("John", 22, "brown"),
                new Person("Eva", 23, "red"),
                new Person("Michael", 42, "blonde"),
                new Person("Sara", 52, "black"),
                new Person("Rus", 25, "brown"),
                new Person("Cody", 51, "blonde"),
                new Person("Mary", 13, "black"),
                new Person("Kary", 53, "black"),
                new Person("Joy", 11, "brown")
        );

        extractNames(persons);
        System.out.println(hairToName(persons));

    }

    private static Map<String, List<String>> hairToName(List<Person> persons) {
        Map<String, List<String>> hairToName = new HashMap<>();
        for (Person person : persons) {
            List<String> names = hairToName.get(person.getHairColour());
            if (names == null) {
                names = new ArrayList<>();
                hairToName.put(person.getHairColour(), names);
            }
            names.add(person.getName());
        }
        return hairToName;
    }

    private static void extractNames(List<Person> persons) {

    }
}
