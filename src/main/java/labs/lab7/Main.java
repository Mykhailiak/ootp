package labs.lab7;

import labs.lab7.representers.MarkdownRepresenter;
import labs.lab7.representers.YamlRepresenter;
import labs.lab7.visitors.HtmlConvertorVisitor;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Welcome to our text editor!");
        YamlRepresenter yamlRepresenter = new YamlRepresenter();
        MarkdownRepresenter markdownRepresenter = new MarkdownRepresenter();
        HtmlConvertorVisitor htmlConvertorVisitor = new HtmlConvertorVisitor();

        yamlRepresenter.setContent("title: Hey there I'm YAML");
        markdownRepresenter.setContent("# Hey there I'm Markdown");

        String htmlMarkdown = htmlConvertorVisitor.convert(markdownRepresenter);
        String htmlYaml = htmlConvertorVisitor.convert(yamlRepresenter);

        System.out.println("Markdown -> HTML: " + htmlMarkdown);
        System.out.println("Yaml -> HTML: " + htmlYaml);

        System.out.println("EDITOR:");
        textEditor.onChange("Lorem ipsum");
        System.out.println("Text editor state #1: " + textEditor.getText());
        textEditor.onChange("Plan for the year");
        System.out.println("Text editor state #2: " + textEditor.getText());
        textEditor.onChange("Plan for the 2023");
        System.out.println("Text editor state #3: " + textEditor.getText());
        textEditor.undoChange();
        textEditor.undoChange();
        System.out.println("Text editor state #4: " + textEditor.getText());
    }
}
