package ro.itschool.curs14.writer;

import ro.itschool.curs13.docs.Document;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DocWriter {
    private final String path;
    private BufferedWriter writer;
    private boolean opened;

    public DocWriter(String path) throws IOException {
        this.path = path;
        this.writer = new BufferedWriter(new FileWriter(path));
        this.opened = true;
    }

    public void write(Document document) throws IOException {
        if (!opened) {
            writer = openWithAppend();
        }
        writer.write(String.format("%s|%s|%s", document.getDocumentId(), document.getName(), document.getContent()));
        writer.newLine();
        writer.flush();
    }

    private BufferedWriter openWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(path, true));
    }

    public void close() throws IOException {
        opened = false;
        writer.close();
    }
}
