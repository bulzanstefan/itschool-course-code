package ro.itschool.curs10;

import java.io.File;
import java.io.FileNotFoundException;

public class PizzaAppMain {
    public static void main(String[] args) throws FileNotFoundException {
        String localDir = new File("").getAbsolutePath();
        System.out.println(localDir);
        String fileName = localDir + System.getProperty("file.separator") + "src/main/resources/input.txt";
        PizzaApp pizzaApp = new PizzaApp(new FileDataReader(fileName));
        pizzaApp.menu();
    }
}
