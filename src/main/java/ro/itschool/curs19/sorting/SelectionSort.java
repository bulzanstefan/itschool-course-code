package ro.itschool.curs19.sorting;

public class SelectionSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }

        for (int i = 0; i < elems.length; i++) {
            final int minPos = findMinPos(i, elems);
            swap(elems, minPos, i);
        }
        return elems;
    }

    private int findMinPos(int start, int[] elems) {
        int minPos = start;
        for (int i = start; i < elems.length; i++) {
            if (elems[minPos] > elems[i]) {
                minPos = i;
            }
        }
        return minPos;
    }
}
