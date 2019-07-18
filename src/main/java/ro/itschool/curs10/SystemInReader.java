package ro.itschool.curs10;

import java.util.Scanner;

public class SystemInReader implements DataReader {
    private Scanner scanner;

    public SystemInReader() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String next() {
        return scanner.next();
    }

    @Override
    public int nextInt() {
        return scanner.nextInt();
    }
}
