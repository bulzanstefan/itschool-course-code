package ro.itschool.curs14;

import ro.itschool.curs13.docs.Document;
import ro.itschool.curs14.writer.DocWriter;

import java.io.IOException;
import java.util.UUID;

public class DocMain {
    public static void main(String[] args) throws IOException {
        DocWriter writer = new DocWriter("src/main/resources/docs.out");
        for (int i = 0; i < 1000; i++) {
            writer.write(new Document(UUID.randomUUID().toString(),
                    "content " + i, "name " + i));
            writer.close();
        }
        writer.close();
    }
}
