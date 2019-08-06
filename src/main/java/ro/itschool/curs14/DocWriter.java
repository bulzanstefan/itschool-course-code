package ro.itschool.curs14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DocWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/output.txt"));
        writer.write("Hello John");
        writer.close();
    }
}
