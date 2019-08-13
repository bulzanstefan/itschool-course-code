package ro.itschool.curs20.generics;

import java.util.Arrays;

public class BubbleSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        final BubbleSort<String> algo = new BubbleSort<>();
        final String[] sort = algo.sort(new String[]{"ghi", "abc", "def"});
        System.out.println(Arrays.toString(sort));
    }

    public T[] sort(T[] elems) {
        if (elems == null) {
            return null;
        }
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < elems.length - 1; i++) {
                if (elems[i].compareTo(elems[i + 1]) > 0) {
                    swap(elems, i, i + 1);
                    sorted = false;
                }
            }
        } while (!sorted);
        return elems;
    }

    void swap(T[] elems, int first, int second) {
        T aux = elems[first];
        elems[first] = elems[second];
        elems[second] = aux;
    }
}
