package ro.itschool.curs20.tmp;

import java.util.Arrays;

public class BubbleSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3, 1, 4, 2};
        BubbleSort<Integer> anyType = new BubbleSort<>();
        System.out.println(Arrays.toString(anyType.sort(array)));
        String[] str = new String[]{"def", "abc", "xyz", "cal"};
        BubbleSort<String> st = new BubbleSort<>();
        System.out.println(Arrays.toString(st.sort(str)));

    }

    public T[] sort(T[] values) {
        if (values == null) {
            return null;
        }

        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < values.length - 1; i++) {
                if (values[i].compareTo(values[i + 1]) > 0) {
                    swap(values, i, i + 1);
                    sorted = false;
                }
            }
        } while (!sorted);

        return values;
    }

    private void swap(T[] elems, int first, int second) {
        T aux = elems[first];
        elems[first] = elems[second];
        elems[second] = aux;
    }
}
