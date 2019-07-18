package ro.itschool.curs10;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataReader implements DataReader {
    private final BufferedReader reader;

    public FileDataReader(String inputFile) throws FileNotFoundException {
        reader = new BufferedReader(new FileReader(inputFile));
    }

    @Override
    public String next() {
        try {
            return reader.readLine().trim();
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    public int nextInt() {
        return Integer.parseInt(next());
    }
}
