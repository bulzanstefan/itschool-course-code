package ro.itschool.curs8;

public abstract class SumArrayOperations implements ArrayOperations {

    abstract String getSource();

    public int sum(int[] array) {
        int result = 0;
        for (int elem : array) {
            result += elem;
        }
        return result;
    }
}
