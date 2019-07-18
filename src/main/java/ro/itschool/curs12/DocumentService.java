package ro.itschool.curs12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static java.util.Collections.unmodifiableList;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = new ArrayList<>(documents);
    }

    public List<Document> getAll() {
        return unmodifiableList(documents);
    }

    public Optional<Document> getDocumentByName(String name) {
        for (Document doc : documents) {
            if (doc.getName().equals(name)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    public Optional<Document> getDocumentById(String id) {
        for (Document doc : documents) {
            if (doc.getDocumentId().equals(id)) {
                return Optional.of(doc);
            }
        }
        return Optional.empty();
    }

    public void addMarkupForDocument(Markup markup, String docId) {
        Optional<Document> doc = getDocumentById(docId);
        if (doc.isPresent()) {
            doc.get().addMarkup(markup);
        }
    }

    public List<Markup> getMarkupsForDocument(String docId) {
        Optional<Document> document = getDocumentById(docId);
        if (document.isPresent()) {
            return document.get().getMarkups();
        }
        return Collections.emptyList();
    }

    public String getDocumentContent(String documentId) {
        Optional<Document> document = getDocumentById(documentId);
        return "";
    }
}
