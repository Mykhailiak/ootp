package labs.lab7;

public class TextEditor {
    private String text;
    private History history = new History();

    public TextEditor(String initialState) {
        this.text = initialState;
    }

    public void onChange(String value) {
        Snapshot snapshot = new Snapshot(this);

        history.add(snapshot);
        updateText(value);

    }

    public void undoChange() {
        history.undo();
    }

    public String getText() {
        return text;
    }

    public void updateText(String value) {
        this.text = value;
    }

    public String backup() {
        return getText();
    }
}
