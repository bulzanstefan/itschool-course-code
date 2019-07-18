package ro.itschool.curs13.docs;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        DocSource docSource = new MemoryDocSource();
//        DocSource docSource = new FileLineDocSource("src/main/resources/doc.in");
        DocSource docSource = new FileSplitDocSource("src/main/resources/doc-split.in");
        testDocumentService(docSource);
    }

    private static void testDocumentService(DocSource docSource) {
        DocumentService service = new DocumentService(docSource.getDocuments());
        System.out.println(service.getAll());
    }
}
