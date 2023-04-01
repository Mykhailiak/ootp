package labs.lab7;

import java.util.ArrayList;

public class History {
    private int historyIndex = 0;
    private ArrayList<Snapshot> list = new ArrayList<>();

    public void add(Snapshot snapshot) {
        list.add(snapshot);
        setHistoryIndex(list.size() - 1);
    }

    private void setHistoryIndex(int value) {
        historyIndex = value;
    }

    private Snapshot getUndo() {
        Snapshot snapshot = list.get(historyIndex);

        if (snapshot != null) {
            setHistoryIndex(historyIndex - 1);
        }

        return snapshot;
    }

    public boolean undo() {
        Snapshot snapshot = getUndo();

        if (snapshot == null) {
            return false;
        }

        snapshot.restore();

        return true;
    }
}
