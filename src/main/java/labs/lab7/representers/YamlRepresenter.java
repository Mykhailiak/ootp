package labs.lab7.representers;

import labs.lab7.visitors.Visitor;

public class YamlRepresenter implements Representer {
    private String content;

    public String getYamlContent() {
        return content;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitYamlRepresenter(this);
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
