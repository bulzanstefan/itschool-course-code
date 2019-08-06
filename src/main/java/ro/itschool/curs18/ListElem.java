package ro.itschool.curs18;

public class ListElem {
    private String value;
    private ListElem next;

    public ListElem(String value) {
        this.value = value;
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public ListElem getNext() {
        return next;
    }

    public void setNext(ListElem next) {
        this.next = next;
    }

    public boolean hasNext() {
        return next != null;
    }
}
