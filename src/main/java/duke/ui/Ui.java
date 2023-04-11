package duke.ui;
import duke.task.TaskList;

import java.util.Scanner;

public class Ui {
    public Ui() {
    }
    public String showWelcome() {
        return "Hello! I'm Duke\n" + "What can I do for you?";
    }
    public String showBye() {
        return "Bye. Hope to see you again soon!";
    }
    public String showLine() {
        return "____________________________________________________________";
    }
    public String showLoadingError() {
        return "☹ OOPS!!! I'm sorry, but I couldn't load your tasks from the file.";
    }
    public String showError(String message) {
        return message;
    }
    public String readCommand() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    public String showList(TaskList tasks) {
        String result = "Here are the tasks in your list:\n";
        for (int i = 0; i < tasks.getLength(); i++) {
            result += (i + 1) + "." + tasks.get(i) + "\n";
        }
        return result;
    }
    public String showDone(TaskList tasks, int index) {
        return "Nice! I've marked this task as done:\n" + tasks.get(index);
    }
    public String showDelete(TaskList tasks, int index) {
        return "Noted. I've removed this task:\n" + tasks.get(index) + "\nNow you have " + (tasks.getLength() - 1) + " tasks in the list.";
    }
    public String showFind(TaskList tasks) {
        String result = "Here are the matching tasks in your list:\n";
        for (int i = 0; i < tasks.getLength(); i++) {
            result += (i + 1) + "." + tasks.get(i) + "\n";
        }
        return result;
    }
    public String showAdd(TaskList tasks, String item) {
        return "Got it. I've added this task:\n" + tasks.get(tasks.getLength() - 1) + "\nNow you have " + tasks.getLength() + " tasks in the list.";
    }
}
