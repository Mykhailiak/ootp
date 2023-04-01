package labs.lab8;

import labs.lab8.fileGetters.FileGetter;

public class Publisher {
    public void publish(FileGetter fileGetter) throws Exception {
        String content = fileGetter.getContent();

        if (!content.startsWith("<h1>")) {
            throw new Exception("Content should be in html format and starts with the <h1> tag.");
        }

        System.out.println("The following content is getting published: " + content);
    }
}
