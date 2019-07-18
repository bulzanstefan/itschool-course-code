package ro.itschool.curs11;

import java.util.Objects;

public class Person {
    private final int id;
    private final String name;
    private final int age;
    private final String occupation;
    private final String sallary;

    public Person(int id, String name, int age, String occupation, String sallary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.sallary = sallary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getSallary() {
        return sallary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, occupation, sallary);
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Person) {
            Person person = (Person) that;
            return id == person.id &&
                    age == person.age &&
                    Objects.equals(name, person.name) &&
                    Objects.equals(occupation, person.occupation) &&
                    Objects.equals(sallary, person.sallary);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", sallary='" + sallary + '\'' +
                '}';
    }
}
