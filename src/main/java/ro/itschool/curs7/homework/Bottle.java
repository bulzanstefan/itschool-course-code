package ro.itschool.curs7.homework;

public class Bottle {
    private int capacity;
    private int available;
    private boolean open;

    public Bottle(int capacity) {
        this.capacity = capacity;
        this.available = capacity;
        this.open = false;
    }

    public boolean hasMore() {
        return available > 0;
    }

    public int getAvailable() {
        return available;
    }

    public int remainingCapacity() {
        return capacity - available;
    }

    public String open() {
        if (open) {
            return "Bottle is already opened";
        } else {
            open = true;
            return "Bottle is open";
        }
    }

    public String close() {
        open = false;
        return "Bottle is closed";
    }

    public String drink(int amount) {
        if (open) {
            return drinkFromOpenBottle(amount);
        } else {
            return "You cannot drink from an closed bottle";
        }
    }

    private String drinkFromOpenBottle(int amount) {
        if (available >= amount) {
            this.available = this.available - amount;
            return "I drank " + amount + ". Remaining " + available;
        } else {
            return "There is not enough liquid";
        }
    }

    @Override
    public String toString() {
        return (open ? "Opened" : "Closed") + " bottle: " + available + "/" + capacity;
    }
}

