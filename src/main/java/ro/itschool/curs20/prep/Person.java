package ro.itschool.curs20.prep;

import java.util.Objects;
import java.util.StringJoiner;

public class Person {
    private final String name;
    private final String location;
    private final int age;
    private final int height;

    public Person(String name, String location, int age, int height) {
        this.name = name;
        this.location = location;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person that = (Person) o;

        return Objects.equals(this.age, that.age) &&
                Objects.equals(this.height, that.height) &&
                Objects.equals(this.location, that.location) &&
                Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, location, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("age = " + age)
                .add("height = " + height)
                .add("location = " + location)
                .add("name = " + name)
                .toString();
    }
}
