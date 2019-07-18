package ro.itschool.curs10.menu;

import ro.itschool.curs10.SystemInReader;

public class MainApp {
    public static void main(String[] args) {
        MenuPage app = new MainMenu(new SystemInReader());
        do {
            app.printMenu();
            int choice = app.getChoice();
            app = app.nextPage(choice);
        } while (app != null);
    }
}
