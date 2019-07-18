package ro.itschool.curs9.homework;

public class ChangeTextFormatter implements TextFormatter {
    private final String source;
    private final String target;

    public ChangeTextFormatter(String source, String target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public String format(String text) {
        return text.replace(source, target);
    }
}
