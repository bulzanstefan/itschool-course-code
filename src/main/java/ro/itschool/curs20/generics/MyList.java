package ro.itschool.curs20.generics;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MyList<T> {
    private T[] array;
    private int size;

    public MyList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        IntStream.range(1, 100)
                .forEach(index -> list.add("elem" + index));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.add("salut");
        list.add("salutare");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.get(2));
    }

    public void add(T elem) {
        ensureCapacity();
        array[size++] = elem;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOfRange(array, 0, array.length + 10);
        }
    }

    public T get(int i) {
        if (i >= size) {
            throw new ArrayIndexOutOfBoundsException("i>" + size);
        }
        return array[i];
    }

    public int size() {
        return size;
    }
}
