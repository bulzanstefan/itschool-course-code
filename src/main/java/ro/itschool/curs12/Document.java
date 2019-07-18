package ro.itschool.curs12;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

public class Document {
    private final String documentId;
    private final String content;
    private final String name;
    private final List<Markup> markups;

    public Document(String documentId, String content, String name) {
        this.documentId = documentId;
        this.content = content;
        this.name = name;
        this.markups = new ArrayList<>();
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public List<Markup> getMarkups() {
        return new ArrayList<>(markups);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Document that = (Document) o;

        return Objects.equals(this.content, that.content) &&
                Objects.equals(this.documentId, that.documentId) &&
                Objects.equals(this.markups, that.markups) &&
                Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, documentId, markups, name);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("content = " + content)
                .add("documentId = " + documentId)
                .add("markups = " + markups)
                .add("name = " + name)
                .toString();
    }

    public void addMarkup(Markup markup) {
        this.markups.add(markup);
    }
}
