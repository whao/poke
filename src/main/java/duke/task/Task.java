package duke.task;

import java.util.ArrayList;

public class Task {
    private boolean isEmpty;
    private int length;
    private final ArrayList<String> tasks;
    public Task() {
        this.isEmpty = true;
        this.length = 0;
        tasks = new ArrayList<>();
    }
    public int getLength() {
        return this.length;
    }
    public boolean isEmpty() {
        return this.isEmpty;
    }
    public void add(String item) {
        this.tasks.add(item);
        this.length++;
        this.isEmpty = false;
    }
    public String get(int index) {
        return this.tasks.get(index);
    }
}
