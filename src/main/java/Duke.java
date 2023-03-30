import duke.task.Task;
import duke.ui.UI;
import java.util.Scanner;
public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        UI.printWelcomeMessage();
        boolean isRunning = true;
        String userInput;
        Task tasks = new Task();
        while (isRunning) {
            userInput = new Scanner(System.in).nextLine();
            switch (userInput.toLowerCase()) {
                case "bye":
                    isRunning = false;
                    break;
                case "list":
                    UI.printList(tasks);
                    break;
                default:
                    UI.printAddMessage(tasks, userInput);
                    break;
            }
        }
        UI.printByeMessage();
    }
}
