package ro.itschool.curs10.menu;

import ro.itschool.curs10.DataReader;

public class PizzaMenu implements MenuPage {
    private final DataReader reader;

    public PizzaMenu(DataReader reader) {
        this.reader = reader;
    }

    @Override
    public void printMenu() {
        System.out.println("Alegeti crusta");
        System.out.println("1. Thin");
        System.out.println("2. Medium");
        System.out.println("3. Thick");
    }

    @Override
    public int getChoice() {
        return reader.nextInt();
    }

    public MenuPage nextPage(int choice) {
        String message;
        switch (choice) {
            case 1:
                message = "Ati ales pizza cu crusta subtire";
                break;
            case 2:
                message = "Ati ales pizza cu crusta medie";
                break;
            case 3:
                message = "Ati ales pizza cu crusta groasa";
                break;
            default:
                System.out.println("Invalid option");
                return this;
        }
        return new FinalMenu(message);
    }
}
