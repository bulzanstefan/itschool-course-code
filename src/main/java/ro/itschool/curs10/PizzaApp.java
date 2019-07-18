package ro.itschool.curs10;

public class PizzaApp {
    private final DataReader reader;

    public PizzaApp(DataReader reader) {
        this.reader = reader;
    }

    public void menu() {
        System.out.println("Ce doriti?");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        int result = reader.nextInt();
        switch (result) {
            case 1:
                pizzaMenu();
                break;
            case 2:
                burgerMenu();
                break;
            default:
                System.out.println("Erroare!");
        }
    }

    private void burgerMenu() {
        System.out.println("Nu avem acum burgeri");
        menu();
    }

    private void pizzaMenu() {
        System.out.println("Alegeti crusta");
        System.out.println("1. Thin");
        System.out.println("2. Medium");
        System.out.println("3. Thick");
        int result = reader.nextInt();
        switch (result) {
            case 1:
                System.out.println("Ati ales o pizza cu crusta subtire. Va multumim");
                break;
            case 2:
                System.out.println("Ati ales o pizza cu crusta medie. Va multumim");
                break;
            case 3:
                System.out.println("Ati ales o pizza cu crusta groasa. Va multumim");
                break;

        }
    }

}
