package labs.lab3;

import labs.lab3.document.Document;
import labs.lab3.document.DocumentTypes;
import labs.lab3.strategies.DocxValidationStrategy;
import labs.lab3.strategies.ExcelValidationStrategy;
import labs.lab3.strategies.ValidationStrategy;

public class Validator {
    private ValidationStrategy validationStrategy;

    private void setValidationStrategy(ValidationStrategy validationStrategy) {
        this.validationStrategy = validationStrategy;
    }

    public boolean validateDocument(Document document) {
        if (document.getType() == DocumentTypes.DOCX) {
            this.setValidationStrategy(new DocxValidationStrategy());
        } else {
            this.setValidationStrategy(new ExcelValidationStrategy());
        }

        return this.validationStrategy.isValid(document);
    }
}
