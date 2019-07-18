package ro.itschool.curs8;

public class Glass {
    private int capacity;
    private int available;

    public Glass(int capacity) {
        this.capacity = capacity;
        this.available = capacity;
    }

    public void drink(int amount) {
        available = available - amount;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getAvailable() {
        return available;
    }
}
