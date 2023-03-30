package duke.command;

public class Command {
    public enum CommandType {
        BYE, LIST, DONE, TODO, DEADLINE, EVENT, DELETE, FIND, INVALID
    }

    private CommandType commandType;

    public Command(String userInput) {
        switch (userInput.toLowerCase()) {
            case "bye":
            case "exit":
            case "quit":
                this.commandType = CommandType.BYE;
                break;
            case "list":
            case "show":
            case "display":
                this.commandType = CommandType.LIST;
                break;
            case "done":
                this.commandType = CommandType.DONE;
                break;
            case "todo":
                this.commandType = CommandType.TODO;
                break;
            case "deadline":
                this.commandType = CommandType.DEADLINE;
                break;
            case "event":
                this.commandType = CommandType.EVENT;
                break;
            case "delete":
                this.commandType = CommandType.DELETE;
                break;
            case "find":
                this.commandType = CommandType.FIND;
                break;
            default:
                this.commandType = CommandType.INVALID;
                break;
        }
    }
}

