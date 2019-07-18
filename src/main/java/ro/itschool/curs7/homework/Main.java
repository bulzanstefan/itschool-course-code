package ro.itschool.curs7.homework;

public class Main {
    public static void main(String[] args) {
        Bottle bottle = new Bottle(500);
        String message = bottle.drink(100);
        System.out.println(message);
        System.out.println(bottle.open());
        System.out.println(bottle.open());
        message = bottle.drink(600);
        System.out.println(message);
        System.out.println(bottle);
    }
}
