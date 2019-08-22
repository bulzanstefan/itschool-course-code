package ro.itschool.curs21;

import java.util.StringJoiner;

public class Person {
    private final String name;
    private final int age;

    Person(String name) {
        this(name, 0);
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("name = " + name)
                .toString();
    }

    public int getAge() {
        return age;
    }
}
