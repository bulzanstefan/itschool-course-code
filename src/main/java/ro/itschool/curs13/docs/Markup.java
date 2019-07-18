package ro.itschool.curs13.docs;

import java.util.Objects;
import java.util.StringJoiner;

public class Markup extends Object {
    private final String markupId;
    private final int position;
    private final String content;

    public Markup(String markupId, int position, String content) {
        this.markupId = markupId;
        this.position = position;
        this.content = content;
    }

    public String getMarkupId() {
        return markupId;
    }

    public int getPosition() {
        return position;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Markup that = (Markup) o;

        return Objects.equals(this.content, that.content) &&
                Objects.equals(this.markupId, that.markupId) &&
                Objects.equals(this.position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, markupId, position);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", this.getClass().getSimpleName() + "[", "]")
                .add("content = " + content)
                .add("markupId = " + markupId)
                .add("position = " + position)
                .toString();
    }
}
