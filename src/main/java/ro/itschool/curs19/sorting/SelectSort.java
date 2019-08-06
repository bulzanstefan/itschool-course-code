package ro.itschool.curs19.sorting;

public class SelectSort implements SortingAlgo {
    @Override
    public int[] sort(int[] elems) {
        if (elems == null) {
            return null;
        }
        for (int i = 0; i < elems.length; i++) {
            int minPos = findMinPos(elems, i);
            swap(elems, i, minPos);
        }
        return elems;
    }

    private int findMinPos(int[] elems, int pos) {
        int minPos = pos;
        for (int i = pos; i < elems.length; i++) {
            if (elems[i] < elems[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
}
