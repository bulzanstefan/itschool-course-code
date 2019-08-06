package ro.itschool.curs18.homework;

import java.util.Random;
import java.util.Scanner;

public class HangmanMain {
    public static void main(String[] args) {
        final Hangman hangman = new Hangman(Dictionary.words[new Random().nextInt(Dictionary.words.length)]);
        final Scanner scanner = new Scanner(System.in);
        while (!hangman.finished()) {
            System.out.print("scrieti o litera: ");
            final String next = scanner.next();
            if (next.length() == 1) {
                hangman.guess(next.charAt(0));
                System.out.println(hangman.getFound());
            } else {
                System.out.println("Doar o litera.");
            }
        }
        System.out.println("FELICITARI! Ati ghicit cuvantul " + hangman.getFound());
    }
}
