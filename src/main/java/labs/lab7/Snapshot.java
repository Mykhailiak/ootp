package labs.lab7;

public class Snapshot {
    private TextEditor textEditor;
    private String backup;

    public Snapshot(TextEditor textEditor) {
        this.textEditor = textEditor;
        this.backup = textEditor.backup();
    }

    public void restore() {
        textEditor.updateText(backup);
    }
}
