package labs.lab7.visitors;

import labs.lab7.representers.MarkdownRepresenter;
import labs.lab7.representers.YamlRepresenter;

public interface Visitor {
    public String visitMarkdownRepresenter(MarkdownRepresenter markdownRepresenter);

    public String visitYamlRepresenter(YamlRepresenter yamlRepresenter);
}
