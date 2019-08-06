package ro.itschool.curs19.searching;

public class JumpSearch implements SearchAlgo {
    private final static int JUMP = 3;

    @Override
    public boolean search(int[] elems, int elem) {
        return jumpSearch(elems, elem, 0, true);
    }

    private boolean jumpSearch(int[] elems, int elem, int pos, boolean jumped) {
        if (!jumped) {
            return false;
        } else if (elem == elems[pos]) {
            return true;
        } else if (elem < elems[pos]) {
            int newPos = jumpDown(pos);
            return jumpSearch(elems, elem, newPos, newPos != pos);
        } else {
            int newPos = jumpUp(pos, elems.length);
            return jumpSearch(elems, elem, newPos, newPos != pos);
        }
    }

    private int jumpDown(int pos) {
        return Math.max(0, pos - JUMP);
    }

    private int jumpUp(int pos, int length) {
        return Math.min(length - 1, pos + JUMP);
    }
}
