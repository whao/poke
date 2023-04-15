package duke.ui;
import duke.util.TaskList;

import java.util.Scanner;

public class Ui {
    public Ui() {
    }
    public String showWelcome() {
        return " ____________________ \n" +
                "< It's all good man. >\n" +
                " -------------------- \n" +
                "        \\   ^__^\n" +
                "         \\  (oo)\\_______\n" +
                "            (__)\\       )\\/\\\n" +
                "                ||----w |\n" +
                "                ||     ||\n"
                + "Hello! I'm Saul Goodman\n"
                + "What can I do for you?";
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
        StringBuilder result = new StringBuilder("Here are the tasks in your list:\n");
        for (int i = 0; i < tasks.getLength(); i++) {
            result.append((i + 1)).append(".").append(tasks.getTask(i)).append("\n");
        }
        return result.toString();
    }
    public String showDone(TaskList tasks, String item) {
        return "Nice! I've marked this task as done:\n" + item;
    }
    public String showUndone(TaskList tasks, String item) {
        return "Nice! I've marked this task as undone:\n" + item;
    }
    public String showDelete(TaskList tasks, String item) {
        return "Noted. I've removed this task:\n" + item + "\nNow you have " + (tasks.getLength()) + " tasks in the list.";
    }
    public String showFind(TaskList tasks) {
        StringBuilder result = new StringBuilder("Here are the matching tasks in your list:\n");
        for (int i = 0; i < tasks.getLength(); i++) {
            result.append((i + 1)).append(".").append(tasks.getTask(i)).append("\n");
        }
        return result.toString();
    }
    public String showAdd(TaskList tasks, String item) {
        return "Got it. I've added this task:\n" + item + "\nNow you have " + tasks.getLength() + " tasks in the list.";
    }
    public String showHelp() {
        return "Here are the commands you can use:\n" +
                "1. todo <description>\n" +
                "2. deadline <description> /by <date>\n" +
                "3. event <description> /from <date> /to <date>\n" +
                "4. list\n" +
                "5. done <index>\n" +
                "6. undone <index>\n" +
                "7. delete <index>\n" +
                "8. find <keyword>\n" +
                "9. bye";
    }
    public String showInvalid() {
        return "☹ OOPS!!! I'm sorry, but I don't know what that means :-(";
    }
}
