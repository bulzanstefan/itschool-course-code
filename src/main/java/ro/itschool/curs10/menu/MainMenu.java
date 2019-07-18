package ro.itschool.curs10.menu;

import ro.itschool.curs10.DataReader;

public class MainMenu implements MenuPage {
    private final DataReader reader;

    public MainMenu(DataReader reader) {
        this.reader = reader;
    }

    @Override
    public void printMenu() {
        System.out.println("Ce doriti?");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
    }

    @Override
    public int getChoice() {
        return reader.nextInt();
    }

    public MenuPage nextPage(int choice) {
        switch (choice) {
            case 1:
                return new PizzaMenu(reader);
            case 2:
                return new BurgerMenu(reader);
            default:
                System.out.println("Unknown choice!");
                return this;
        }
    }
}
