package ro.itschool.curs22;

import java.util.Objects;
import java.util.StringJoiner;

public class Student {
    private final String name;
    private final String group;
    private final String course;
    private final int grade;

    public Student(String name, String group, String course, int grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student that = (Student) o;

        return Objects.equals(this.course, that.course) &&
                Objects.equals(this.grade, that.grade) &&
                Objects.equals(this.group, that.group) &&
                Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, grade, group, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("course = " + course)
                .add("grade = " + grade)
                .add("group = " + group)
                .add("name = " + name)
                .toString();
    }
}
