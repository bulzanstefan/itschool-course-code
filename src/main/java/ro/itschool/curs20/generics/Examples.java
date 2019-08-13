package ro.itschool.curs20.generics;

interface Boxable {
    String boxMe();
}

interface Dusty {
}

public class Examples {
    public static void main(String[] args) {
        final Box<Carte> cutie = new Box<>(new Carte());
        final Box<Cd> cutieCuCd = new Box<>(new Cd());
//        new Box<>(new Dog()); // this is not allowed!
        Carte content = cutie.getContent();
        Cd cd = cutieCuCd.getContent();

        Pair<String, Dog> carte = new Pair<>("carte", new Dog());
        Pair<Dog, Cd> docCd = new Pair<>(new Dog(), new Cd());
    }
}

class Dog {
}

class Cd implements Boxable {
    private String title;

    @Override
    public String boxMe() {
        return null;
    }
}

class Carte implements Boxable {
    public String name;

    @Override
    public String boxMe() {
        return null;
    }
}

class Box<T extends Boxable> {
    private final T content;

    Box(T content) {
        this.content = content;
    }

    public String box() {
        return content.boxMe();
    }

    public T getContent() {
        return content;
    }
}

class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
