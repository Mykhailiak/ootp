package labs.lab3.strategies;

import labs.lab3.document.Document;

public class DocxValidationStrategy implements ValidationStrategy {
    @Override
    public boolean isValid(Document document) {
        return document.getData().contains("header");
    }
}
