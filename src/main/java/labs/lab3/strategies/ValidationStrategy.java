package labs.lab3.strategies;

import labs.lab3.document.Document;

public interface ValidationStrategy {
    boolean isValid(Document document);
}
