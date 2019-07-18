package ro.itschool.curs10.menu;

public class FinalMenu implements MenuPage {
    private final String message;

    public FinalMenu(String message) {
        this.message = message;
    }

    @Override
    public void printMenu() {
        System.out.println(message);
        System.out.println("Va multumim");
    }

    @Override
    public int getChoice() {
        return -1;
    }

    @Override
    public MenuPage nextPage(int choice) {
        return null;
    }
}
