package ro.itschool.curs22;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class StudentService {
    private final List<Student> students;

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public double getAverageGrade() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .average()
                .orElse(0d);
    }

    public Map<String, Integer> mapNameToGrade() {
        return students.stream()
                .collect(toMap(Student::getName, Student::getGrade, this::avg));
    }

    private int avg(Integer oldGrade, Integer newGrade) {
        return Math.round((oldGrade + newGrade) / 2);
    }

    public boolean checkFailedFilterFirst() {
        return students.stream()
                .filter(student -> student.getGrade() <= 4)
                .findFirst()
                .isPresent();
    }

    public boolean checkFailedFilter() {
        return students.stream()
                .filter(student -> student.getGrade() <= 4)
                .findAny()
                .isPresent();
    }

    public boolean checkFailedMin() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .min()
                .orElse(5) <= 4;
    }

    public boolean checkFailedAllMatch() {
        return students.stream()
                .allMatch(this::studentPassed);
    }

    private boolean studentPassed(Student student) {
        return student.getGrade() > 4;
    }

    public boolean checkFailedAnyMatch() {
        return students.stream()
                .anyMatch(student -> isFailed(student.getGrade()));
    }

    public boolean checkFailedAnyMatchMR() {
        return students.stream()
                .mapToInt(Student::getGrade)
                .anyMatch(this::isFailed);
    }

    private boolean isFailed(int grade) {
        return grade < 5;
    }

}
