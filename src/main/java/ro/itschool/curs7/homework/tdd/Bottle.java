package ro.itschool.curs7.homework.tdd;

public class Bottle {
    private final int capacity;
    private int available;

    public Bottle(int capacity, int available) {
        this.capacity = capacity;
        if (available >= 0) {
            this.available = available;
        } else {
            throw new RuntimeException("You cannot have negative availability");
        }
    }

    public boolean hasMoreLiquid() {
        return available > 0;
    }
}
