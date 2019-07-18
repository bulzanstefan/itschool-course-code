package ro.itschool.curs12;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        List<Document> documents = new ArrayList<>();
        documents.addAll(List.of(
                new Document(UUID.randomUUID().toString(), "Ana are mere", "Povestea Anei"),
                new Document(UUID.randomUUID().toString(), "Petru are pere", "Povestea lui Petru"),
                new Document(UUID.randomUUID().toString(), "Ionut are castane", "Povestea Ionutului")
        ));

        DocumentService documentService = new DocumentService(documents);
        List<Document> docs = documentService.getAll();
        System.out.println(docs);
        System.out.println(documentService.getAll());
        Optional<Document> doc = documentService.getDocumentByName("Povestea Anei8");
        System.out.println(doc);
        Document result = doc.orElse(new Document("N/A", "N/A", "N/A"));
        System.out.println(result);
        if (doc.isPresent()) {
            System.out.println(doc.get().getName());
        }

    }
}

