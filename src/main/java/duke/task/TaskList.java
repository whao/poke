package duke.task;

import java.util.ArrayList;
import duke.task.Task;

public class TaskList {
    private boolean isEmpty;
    private int length;
    private final ArrayList<Task> tasks;
    public TaskList() {
        this.isEmpty = true;
        this.length = 0;
        tasks = new ArrayList<>();
    }
    public TaskList(ArrayList<Task> tasks) {
        this.isEmpty = false;
        this.length = tasks.size();
        this.tasks = tasks;
    }
    public int getLength() {
        return this.length;
    }
    public boolean isEmpty() {
        return this.isEmpty;
    }
    public void add(String item) {
        Task task = new Task(item);
        this.tasks.add(task);
        this.length++;
        this.isEmpty = false;
    }
    public String get(int index) {
        return this.tasks.get(index).toString();
    }
}
