import java.util.Scanner;
public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        String topBanner = "################################";
        String bottomBanner = "################################";
        String welcomeMsg = "Hello! I'm Duke\nWhat can I do for you?";
        System.out.println(topBanner);
        System.out.println(welcomeMsg);
        System.out.println(bottomBanner);
        boolean isRunning = true;
        String userInput;
        ToDoList toDoList = new ToDoList();
        while (isRunning) {
            userInput = new Scanner(System.in).nextLine();
            switch (userInput.toLowerCase()) {
                case "bye":
                    isRunning = false;
                    break;
                case "list":
                    System.out.println(topBanner);
                    if (toDoList.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        for (int i = 0; i < toDoList.getLength(); i++) {
                            System.out.println((i + 1) + ". " + toDoList.get(i));
                        }
                    }
                    System.out.println(bottomBanner);
                    break;
                default:
                    System.out.println(topBanner);
                    toDoList.add(userInput);
                    System.out.println("added: " + userInput);
                    System.out.println(bottomBanner);
                    break;
            }
        }
        System.out.println(topBanner);
        System.out.println("Bye.");
        System.out.println(bottomBanner);
    }
}
