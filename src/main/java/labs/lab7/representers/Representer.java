package labs.lab7.representers;

import labs.lab7.visitors.Visitor;

public interface Representer {
    void setContent(String text);

    String accept(Visitor visitor);
}
