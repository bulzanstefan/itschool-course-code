package ro.itschool.curs10;

import java.util.Arrays;
import java.util.List;

public class CircularReader implements DataReader {
    private final List<String> elements;
    private int index = 0;

    public CircularReader(String... elements) {
        this.elements = Arrays.asList(elements);
    }

    @Override
    public String next() {
        String result = elements.get(index);
        increment();
        return result;
    }

    @Override
    public int nextInt() {
        return Integer.parseInt(next());
    }

    private void increment() {
        index = (index + 1) % elements.size();
    }
}
