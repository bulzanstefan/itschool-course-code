package ro.itschool.curs10.menu;

import ro.itschool.curs10.DataReader;

public class BurgerMenu implements MenuPage {
    private final DataReader reader;

    public BurgerMenu(DataReader reader) {
        this.reader = reader;
    }

    @Override
    public void printMenu() {
        System.out.println("Nu avem acum burgeri");
        System.out.println("Apasati 1 pentru a va intoarce la meniul principal");
    }

    @Override
    public int getChoice() {
        return reader.nextInt();
    }

    @Override
    public MenuPage nextPage(int choice) {
        return new MainMenu(reader);
    }
}
