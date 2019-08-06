package ro.itschool.curs19.sorting;

public class InsertSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }
        for (int i = 1; i < elems.length; i++) {
            insert(elems, i);
        }
        return elems;
    }

    private void insert(int[] elems, int pos) {
        int value = elems[pos];
        int j = pos - 1;
        while (j >= 0 && elems[j] > value) {
            elems[j + 1] = elems[j];
            j--;
        }
        elems[j + 1] = value;
    }
}
