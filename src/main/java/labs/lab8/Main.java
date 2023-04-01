package labs.lab8;

import labs.lab8.decorators.*;
import labs.lab8.fileGetters.MarkdownArticleGetter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        RequestData requestIdDecorator = new FilePrefixDecorator(
                new RequestIdDecorator(
                        new DateFieldDecorator(
                                new HttpService()
                        )
                )
        );
        MarkdownArticleGetter markdownArticleGetter = new MarkdownArticleGetter("article.md");
        MarkdownHtmlFileGetterAdapter markdownHtmlFileGetterAdapter = new MarkdownHtmlFileGetterAdapter(markdownArticleGetter);
        Publisher publisher = new Publisher();

        publisher.publish(markdownHtmlFileGetterAdapter);

        requestIdDecorator.write("data.json");
    }
}
