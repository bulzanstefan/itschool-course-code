package ro.itschool.curs9.homework;

public class NSATextFormatter implements TextFormatter {

    @Override
    public String format(String text) {
        return text.replace("NSA", "*****");
    }
}
