package duke.util;

import duke.command.Command;

public class Parser {
    /**
     * Parses the user input and returns the corresponding command.
     *
     * @param fullCommand The user input.
     * @return The corresponding command.
     */
    public static Command parse(String fullCommand) {
        String[] command = fullCommand.split(" ", 2);
        switch (command[0]) {
        case "bye":
            return new Command("bye");
        case "list":
            return new Command("list");
        case "done":
            return new Command("done", command[1]);
        case "delete":
            return new Command("delete", command[1]);
        case "todo":
            return new Command("todo", command[1]);
        case "deadline":
            return new Command("deadline", command[1]);
        case "event":
            return new Command("event", command[1]);
        case "find":
            return new Command("find", command[1]);
        default:
            return new Command("invalid");
        }
    }
}
