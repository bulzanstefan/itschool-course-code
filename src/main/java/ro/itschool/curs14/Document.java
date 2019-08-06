package ro.itschool.curs14;

import ro.itschool.curs13.docs.Markup;

import java.util.*;

public class Document {
    private String documentId;
    private String content;
    private String name;
    private List<Markup> markups;

    public Document() {
    }

    public Document(String content, String name) {
        this(UUID.randomUUID().toString(), content, name);
    }

    public Document(String documentId, String content, String name) {
        this.documentId = documentId;
        this.content = content;
        this.name = name;
        this.markups = new ArrayList<>();
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Markup> getMarkups() {
        return new ArrayList<>(markups);
    }

    public void setMarkups(List<Markup> markups) {
        this.markups = markups;
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
