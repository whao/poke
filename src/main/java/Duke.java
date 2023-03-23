import java.util.Scanner;

public class Duke {
    public static void main(String[] args) {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("Hello from\n" + logo);
        String topBanner = "################################\n";
        String bottomBanner = "################################\n";
        String welcomeMsg = "Hello! I'm Duke\nWhat can I do for you?";
        System.out.println(topBanner);
        System.out.println(welcomeMsg);
        System.out.println(bottomBanner);
        String userInput = new Scanner(System.in).nextLine();
        while (!userInput.equalsIgnoreCase("bye")) {
            System.out.println(topBanner);
            System.out.println(userInput);
            System.out.println(bottomBanner);
            userInput = new Scanner(System.in).nextLine();
        }
        System.out.println(topBanner);
        System.out.println("Bye.");
        System.out.println(bottomBanner);
    }
}
