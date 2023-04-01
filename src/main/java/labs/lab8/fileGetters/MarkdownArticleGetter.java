package labs.lab8.fileGetters;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MarkdownArticleGetter implements FileGetter {
    private String filename;

    public MarkdownArticleGetter(String filename) {
        this.filename = filename;
    }

    public String getContent() throws IOException {
        Path fileName = Path.of("/Users/yurii.mykhailiak/Projects/ootp/src/main/java/labs/lab8/" + this.filename);

        return Files.readString(fileName);
    }
}
