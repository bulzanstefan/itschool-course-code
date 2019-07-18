package ro.itschool.curs8;

public class Mug extends Glass {
    private int handleRadius;

    public Mug() {
        this(300);
    }

    public Mug(int capacity) {
        super(capacity);
        this.handleRadius = 15;
    }

    public int getHandleRadius() {
        return handleRadius;
    }

    @Override
    public int getCapacity() {
        return super.getCapacity();
    }
}
