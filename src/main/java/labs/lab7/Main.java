package labs.lab7;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Welcome to our text editor!");

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
