package duke.util;

import duke.task.TaskList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Storage {
    private final String filePath;
    public Storage(String filePath) {
        this.filePath = filePath;
    }
    public String getFilePath() {
        return this.filePath;
    }

    public TaskList load() throws SQLException{
        TaskList tasks = new TaskList();
        Connection conn = DriverManager.getConnection("jdbc:sqlite:" + this.filePath);
        conn.close();

        return tasks;
    }
}
