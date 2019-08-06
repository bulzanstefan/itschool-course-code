package ro.itschool.curs19.searching;

public class LinearSearch implements SearchAlgo {
    @Override
    public boolean search(int[] elems, int elem) {
        if (elems == null) {
            return false;
        }
        for (int i = 0; i < elems.length; i++) {
            if (elem == elems[i]) {
                return true;
            }
        }
        return false;
    }
}
