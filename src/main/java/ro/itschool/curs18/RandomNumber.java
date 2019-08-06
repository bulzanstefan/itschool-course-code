package ro.itschool.curs18;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        final Random random = new Random();
        System.out.println(random.nextInt(3) + 1);
    }
}
