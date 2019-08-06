package ro.itschool.curs14;

import ro.itschool.curs13.docs.Document;
import ro.itschool.curs14.reader.RestDocSource;

import java.util.List;

public class RestMain {
    public static void main(String[] args) {
        List<Document> documents = new RestDocSource().getDocuments();
        System.out.println(documents);
    }
}
