package ro.itschool.curs18.homework;

import java.util.ArrayList;
import java.util.List;

public class Hangman {
    private final String word;
    private String found;

    public Hangman(String word) {
        this.word = word;
        this.found = fillFound(word.length());
    }

    private String fillFound(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            sb.append("_");
        }
        return sb.toString();
    }

    public boolean guess(char c) {
        List<Integer> indexes = getIndexes(c);
        found = fillInIndexes(indexes, c);
        return !indexes.isEmpty();
    }

    private String fillInIndexes(List<Integer> indexes, char c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < found.length(); i++) {
            if (indexes.contains(i)) {
                sb.append(c);
            } else {
                sb.append(found.charAt(i));
            }
        }
        return sb.toString();
    }

    private List<Integer> getIndexes(char c) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                result.add(i);
            }
        }
        return result;
    }

    public String getFound() {
        return found;
    }

    public boolean finished() {
        return !found.contains("_");
    }
}
