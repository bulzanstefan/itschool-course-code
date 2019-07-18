package ro.itschool.curs12;

import java.util.List;

public class DocumentPrinter {
    private final Document document;

    public DocumentPrinter(Document document) {
        this.document = document;
    }

    public String printWithMarkups() {
        List<Markup> markups = document.getMarkups();
        return null;
    }
}
