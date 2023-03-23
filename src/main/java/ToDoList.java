import java.util.ArrayList;

public class ToDoList {
    private boolean isEmpty;
    private int length;
    private final ArrayList<String> toDoList;
    public ToDoList() {
        this.isEmpty = true;
        this.length = 0;
        toDoList = new ArrayList<>();
    }
    public int getLength() {
        return this.length;
    }
    public boolean isEmpty() {
        return this.isEmpty;
    }
    public void add(String item) {
        this.toDoList.add(item);
        this.length++;
        this.isEmpty = false;
    }
    public String get(int index) {
        return this.toDoList.get(index);
    }
}
