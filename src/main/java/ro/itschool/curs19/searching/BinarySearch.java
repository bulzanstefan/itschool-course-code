package ro.itschool.curs19.searching;

import java.util.Arrays;

public class BinarySearch implements SearchAlgo {
    @Override
    public boolean search(int[] elems, int elem) {
        int pivot = elems.length / 2;
        if (elems.length == 0) {
            return false;
        } else if (elem == elems[pivot]) {
            return true;
        } else if (elem > elems[pivot]) {
            return search(Arrays.copyOfRange(elems, pivot + 1, elems.length), elem);
        } else {
            return search(Arrays.copyOfRange(elems, 0, pivot - 1), elem);
        }
    }
}
