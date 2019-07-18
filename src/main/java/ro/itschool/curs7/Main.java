package ro.itschool.curs7;

public class Main {
    public static void main(String[] args) {
        Door door = new Door();
        System.out.println("Door is open? " + door.isOpen());
        System.out.println("Door is closed? " + !door.isOpen());
        System.out.println("Door is open? " + door.isOpen());

        Door door2 = new Door(true, false);
        System.out.println(door2);

        door2.doorLabels("a", "b");
        door2.doorLabels("a");
        door2.doorLabelsArr(new String[]{"a"});

    }
}
