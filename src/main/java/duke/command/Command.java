package duke.command;
import duke.task.Task;
import duke.task.TaskList;
import duke.task.Todo;
import duke.ui.Ui;
import duke.util.Storage;
public class Command {
    public static final String BYE = "bye";
    public static final String LIST = "list";
    public static final String DONE = "done";
    public static final String DELETE = "delete";
    public static final String TODO = "todo";
    public static final String DEADLINE = "deadline";
    public static final String EVENT = "event";
    public static final String FIND = "find";
    public static final String HELP = "help";
    public static final String INVALID = "invalid";
    private final String command;
    private final String description;
    private final String time;
    public Command(String command, String description, String time) {
        this.command = command;
        this.description = description;
        this.time = time;
    }
    public Command(String command, String description) {
        this.command = command;
        this.description = description;
        this.time = "";
    }
    public Command(String command) {
        this.command = command;
        this.description = "";
        this.time = "";
    }
    public String getCommand() {
        return this.command;
    }
    public String getDescription() {
        return this.description;
    }
    public String getTime() {
        return this.time;
    }
    public boolean isBye() {
        return this.command.equals(BYE);
    }
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        switch (this.command) {
        case BYE:
            ui.showBye();
            break;
        case LIST:
            ui.showList(tasks);
            break;
        case DONE:
            int index = Integer.parseInt(this.description);
            Task task = tasks.get(index - 1);
            task.markAsDone();
            ui.showDone(task);
            break;
        case DELETE:
            int index2 = Integer.parseInt(this.description);
            Task task2 = tasks.get(index2 - 1);
            tasks.delete(index2 - 1);
            ui.showDelete(task2, tasks);
            break;
        case TODO:
            Task todo = new Todo(this.description);
            tasks.add(todo);
            ui.showAdd(todo, tasks);
            break;
        case DEADLINE:
            String[] deadline = this.description.split(" /by ", 2);
            Task deadlineTask = new Task(deadline[0], deadline[1]);
            tasks.add(deadlineTask);
            ui.showAdd(deadlineTask, tasks);
            break;
        case EVENT:
            String[] event = this.description.split(" /at ", 2);
            Task eventTask = new Task(event[0], event[1]);
            tasks.add(eventTask);
            ui.showAdd(eventTask, tasks);
            break;
        case FIND:
            TaskList foundTasks = tasks.find(this.description);
            ui.showFound(foundTasks);
            break;
        case HELP:
            ui.showHelp();
            break;
        default:
            ui.showInvalid();
            break;
        }
    }
}

