package ro.itschool.curs9.homework;

public class UpperCaseFormatter implements TextFormatter {
    private final String textToUppercase;

    public UpperCaseFormatter(String textToUppercase) {
        this.textToUppercase = textToUppercase;
    }

    @Override
    public String format(String text) {
        return text.replace(textToUppercase, textToUppercase.toUpperCase());
    }

}
