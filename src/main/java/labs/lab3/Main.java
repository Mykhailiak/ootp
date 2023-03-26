package labs.lab3;

import labs.lab3.document.Document;
import labs.lab3.document.DocumentTypes;

public class Main {
    public static void main(String[] args) {
        Document validExcelDoc = new Document(DocumentTypes.EXCEL, "A0:B0");
        Document invalidExcelDoc = new Document(DocumentTypes.EXCEL, "random content");
        Document validDocxDoc = new Document(DocumentTypes.DOCX, "header");
        Document invalidDocxDoc = new Document(DocumentTypes.DOCX, "A0:B0");
        Validator validator = new Validator();

        System.out.println(validator.validateDocument(validDocxDoc)); // TRUE
        System.out.println(validator.validateDocument(invalidDocxDoc)); // FALSE
        System.out.println(validator.validateDocument(validExcelDoc)); // TRUE
        System.out.println(validator.validateDocument(invalidExcelDoc)); // FALSE
    }
}
