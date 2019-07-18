package ro.itschool.curs10.persons;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;
    private final String hairColour;

    public Person(String name, int age, String hairColour) {
        this.name = name;
        this.age = age;
        this.hairColour = hairColour;
    }

    public String getHairColour() {
        return hairColour;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return ((Person) obj).getName().equals(this.name);
        }
        return false;
    }
}
