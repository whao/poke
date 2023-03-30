package duke.ui;
import duke.task.Task;
public class UI {
    private static final String borderLine = "################################";
public static void printWelcomeMessage() {
        String welcomeMsg = "Hello! I'm Duke\nWhat can I do for you?";
        System.out.println(borderLine);
        System.out.println(welcomeMsg);
        System.out.println(borderLine);
    }
    public static void printByeMessage() {
        System.out.println(borderLine);
        System.out.println("Bye.");
        System.out.println(borderLine);
    }
    public static void printList(Task toDoList) {
        System.out.println(borderLine);
        if (toDoList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            for (int i = 0; i < toDoList.getLength(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
        System.out.println(borderLine);
    }
    public static void printAddMessage(Task toDoList, String userInput) {
        System.out.println(borderLine);
        toDoList.add(userInput);
        System.out.println("added: " + userInput);
        System.out.println(borderLine);
    }
}
