package labs.lab7.representers;

import labs.lab7.visitors.Visitor;

public class MarkdownRepresenter implements Representer {
    private String content;

    public String getMarkdownText() {
        return content;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitMarkdownRepresenter(this);
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
