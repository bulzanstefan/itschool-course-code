package ro.itschool.curs22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodRefs {
    public static void main(String[] args) {
        final List<Student> students = List.of(
                new Student("Maria", "A", "Analiza numerica", 7)
                , new Student("Maria", "B", "English", 10)
                , new Student("Ioan", "C", "Analiza numerica", 9)
                , new Student("George", "B", "Analiza numerica", 5)
                , new Student("Mihai", "A", "Engleza", 8)
        );


        System.out.println(students.stream()
                .filter(s -> s.getGroup().equals("A"))
                .sorted(Comparator.comparingInt(Student::getGrade))
                .findFirst()
                .orElse(null));
        final StudentService svc = new StudentService(students);
        System.out.println(svc.mapNameToGrade());


        final Map<String, Integer> collect = students.stream()
                .collect(Collectors.toMap(student -> student.getName(), student -> student.getGrade(), (g1, g2) -> g1 > g2 ? g1 : g2));
        final Map<String, List<Integer>> collect2 = students.stream()
                .collect(Collectors.toMap(student -> student.getName(), student -> List.of(student.getGrade()), (l1, l2) -> mergeLists(l1, l2)));
        System.out.println(collect2);
        System.out.println(collect);
        System.out.println(svc
                .getAverageGrade());

    }

    private static List<Integer> mergeLists(List<Integer> l1, List<Integer> l2) {
        final List<Integer> result = new ArrayList<>(l1);
        result.addAll(l2);
        return result;
    }
}
