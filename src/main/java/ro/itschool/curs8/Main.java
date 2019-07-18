package ro.itschool.curs8;

public class Main {
    public static void main(String[] args) {
        Glass glass = new Glass(200);
        System.out.println(glass.getAvailable());
        glass.drink(10);
        System.out.println(glass.getAvailable());

        Mug mug = new Mug();
        System.out.println(mug.getAvailable());
        mug.drink(10);
        System.out.println(mug.getAvailable());
        System.out.println(mug.getHandleRadius());

        Glass mugGlass = new Mug();
        System.out.println(mugGlass.getAvailable());
    }
}
