package labs.lab8;

import labs.lab7.representers.MarkdownRepresenter;
import labs.lab7.visitors.HtmlConvertorVisitor;
import labs.lab8.fileGetters.FileGetter;
import labs.lab8.fileGetters.MarkdownArticleGetter;

import java.io.IOException;

public class MarkdownHtmlFileGetterAdapter implements FileGetter {
    private MarkdownArticleGetter markdownArticleGetter;

    public MarkdownHtmlFileGetterAdapter(MarkdownArticleGetter markdownArticleGetter) {
        this.markdownArticleGetter = markdownArticleGetter;
    }

    @Override
    public String getContent() throws IOException {
        String markdown = markdownArticleGetter.getContent();
        MarkdownRepresenter markdownRepresenter = new MarkdownRepresenter();
        HtmlConvertorVisitor htmlConvertorVisitor = new HtmlConvertorVisitor();

        System.out.println("Original content: " + markdown);

        markdownRepresenter.setContent(markdown);

        return htmlConvertorVisitor.convert(markdownRepresenter);
    }
}
