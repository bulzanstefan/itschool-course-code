package ro.itschool.curs16;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Throwable {
        throwableThrow();
        try {
            metoda();
            System.out.println("metoda a mers");
//            metoda2();
            System.out.println("Nu se executa");
        } catch (NullPointerException rex) {
            System.out.println(" a aparut o problema");
        } catch (Exception rex) {
            System.out.println(" a aparut o problema");
        } finally {
            System.out.println("Se executa indiferent");
        }

        try (BufferedWriter br = new BufferedWriter(new FileWriter("src/main/resources/out.txt"))) {
            br.write("ceva");
            metoda();
        } catch (RuntimeException e) {
            System.out.println("exc");
        }
    }

    private static void throwableThrow() throws Throwable {
        throw new Throwable("generic");
    }

    private static void metoda2() {
//        if (System.currentTimeMillis() % 4 == 0) {
        throw new NullPointerException("NullPointer");
//        }
    }

    private static void metoda() {
//        if (System.currentTimeMillis() % 4 != 0) {
        throw new IllegalArgumentException("Ceva nu e bine");
//        }
    }
}
