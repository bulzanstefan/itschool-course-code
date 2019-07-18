package ro.itschool.curs10.menu;

public interface MenuPage {
    void printMenu();

    int getChoice();

    MenuPage nextPage(int choice);
}
