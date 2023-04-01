package labs.lab7.visitors;

import labs.lab7.representers.MarkdownRepresenter;
import labs.lab7.representers.Representer;
import labs.lab7.representers.YamlRepresenter;

public class HtmlCovertorVisitor implements Visitor {
    public String visitMarkdownRepresenter(MarkdownRepresenter markdownRepresenter) {
        String markdown = markdownRepresenter.getMarkdownText();

        if (markdown.startsWith("# ")) {
            String title = markdown.substring(2);

            return String.format("<h1>%s</h1>", title);
        }

        return null;
    }

    public String visitYamlRepresenter(YamlRepresenter yamlRepresenter) {
        String yaml = yamlRepresenter.getYamlContent();

        if (yaml.startsWith("title: ")) {
            String title = yaml.substring(7);

            return String.format("<h1>%s</h1>", title);
        }

        return null;
    }

    public String convert(Representer representer) {
        return representer.accept(this);
    }
}
