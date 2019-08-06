package ro.itschool.curs18;

public class LinkedList {
    private ListElem first;
    private ListElem last;

    public void add(String value, int position) {
        add(value, first, position);
    }

    private void add(String value, ListElem crtElem, int position) {
        if (crtElem == null) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (position == 0) {
            final ListElem nextElem = crtElem.getNext();
            final ListElem newElem = new ListElem(value);
            crtElem.setNext(newElem);
            newElem.setNext(nextElem);
        } else {
            add(value, crtElem.getNext(), position - 1);
        }
    }

    public void add(String value) {
        if (last == null) {
            first = new ListElem(value);
            last = first;
        } else {
            final ListElem newElem = new ListElem(value);
            last.setNext(newElem);
            last = newElem;
        }
    }

    public String get(int position) {
        if (first == null) {
            return null;
        } else {
            int i = 0;
            ListElem elem = first;
            while (i < position && elem.hasNext()) {
                elem = elem.getNext();
                i++;
            }
            if (i == position) {
                return elem.getValue();
            } else {
                return null;
            }
        }
    }

    public String getRec(int position) {
        return getRec(position, first);
    }

    private String getRec(int position, ListElem elem) {
        if (elem == null) {
            return null;
        } else if (position == 0) {
            return elem.getValue();
        } else {
            return getRec(position - 1, elem.getNext());
        }
    }
}
