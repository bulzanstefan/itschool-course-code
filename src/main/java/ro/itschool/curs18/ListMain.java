package ro.itschool.curs18;

public class ListMain {
    public static void main(String[] args) {
        final LinkedList linkedList = new LinkedList();
        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
        linkedList.add("d");
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.getRec(2));

        linkedList.add("d", 2);
    }
}
