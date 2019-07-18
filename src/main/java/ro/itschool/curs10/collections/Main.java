package ro.itschool.curs10.collections;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        words.add("Ana");
        words.add("are");
        words.add("mere");
        words.add("multe");
        words.add("mere");
        words.add("si");
        words.add("pere");
        words.add("Ana");
        words.add("si");
        words.add("Maria");
        words.add("si");
        words.add("Ionut");

        List<String> result = duplicateWord("mere", words);
        System.out.println(result);
        List<String> removedMere = removeWord("mere", words);
        System.out.println(removedMere);
        removeWordRef("Ana", new HashSet<>(words));
        System.out.println(words);

        System.out.println(new HashSet<>(words));
    }


    public static void removeWordRef(String word, Collection<String> words) {
        Iterator<String> wordIterator = words.iterator();
        while (wordIterator.hasNext()) {
            String next = wordIterator.next();
            if (next.equals(word)) {
                wordIterator.remove();
            }
        }
    }

    public static List<String> removeWord(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            if (!element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }

    public static List<String> duplicateWord(String word, List<String> words) {
        List<String> result = new ArrayList<>();
        for (String element : words) {
            result.add(element);
            if (element.equals(word)) {
                result.add(element);
            }
        }
        return result;
    }
}
