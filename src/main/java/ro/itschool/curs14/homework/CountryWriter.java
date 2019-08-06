package ro.itschool.curs14.homework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CountryWriter {
    private final BufferedWriter writer;
    private boolean first = true;

    public CountryWriter(String path) throws IOException {
        writer = new BufferedWriter(new FileWriter(path));
    }

    public void write(List<Country> countries) throws IOException {
        for (Country country : countries) {
            write(country, false);
        }
        writer.flush();
    }

    public void write(Country country) throws IOException {
        write(country, true);
    }

    public void write(Country country, boolean flush) throws IOException {
        newLineIfNeeded();
        String borders = String.join("~", country.getBorders());
        writer.write(String.join("|",
                country.getName(),
                country.getCapital(),
                String.valueOf(country.getPopulation()),
                String.valueOf(country.getArea()),
                country.getRegion(),
                borders));

        if (flush) {
            writer.flush();
        }
    }

    private void newLineIfNeeded() throws IOException {
        if (!first) {
            writer.newLine();
        } else {
            first = false;
        }
    }

    public void close() throws IOException {
        writer.close();
    }
}
