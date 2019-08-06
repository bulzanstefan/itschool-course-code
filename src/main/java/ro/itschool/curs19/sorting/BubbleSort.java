package ro.itschool.curs19.sorting;

public class BubbleSort implements SortingAlgo {
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < elems.length - 1; i++) {
                if (elems[i] > elems[i + 1]) {
                    swap(elems, i, i + 1);
                    sorted = false;
                }
            }
        } while (!sorted);
        return elems;
    }
}
