package ro.itschool.curs9.homework;

public class UpperCaseSuffixFormatter extends UpperCaseFormatter {
    private final String suffix;

    public UpperCaseSuffixFormatter(String textToUppercase, String suffix) {
        super(textToUppercase);
        this.suffix = suffix;
    }

    @Override
    public String format(String text) {
        return format(text, suffix);
    }

    public String format(String text, String customSuffix) {
        return super.format(text) + customSuffix;
    }
}
