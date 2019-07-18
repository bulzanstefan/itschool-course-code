package ro.itschool.curs7;

public class Door implements AccessProvider {
    private boolean open;
    private boolean locked;

    Door() {
        open = true;
    }

    Door(boolean open) {
        this.open = open;
    }

    Door(boolean open, boolean locked) {
        this.open = open;
        this.locked = locked;
    }

    @Override
    public void open(int distance) {
        locked = false;
        open = true;
    }

    @Override
    public void closeSpace() {
        locked = false;
        open = false;
    }

    @Override
    public void lock() {
        locked = true;
    }

    void unlockDoor() {
        locked = false;
    }

    boolean isLocked() {
        return locked;
    }

    boolean isOpen() {
        return open;
    }

    void doorLabels(String... labels) {
        for (String label : labels) {
            System.out.println(label);
        }
    }

    void doorLabelsArr(String[] labels) {
        for (String label : labels) {
            System.out.println(label);
        }
    }

    public String toString() {
        return "Door is opened?" + open + " and is locked? " + locked;
    }

}