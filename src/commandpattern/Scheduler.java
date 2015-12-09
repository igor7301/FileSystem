package commandpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 04.12.15.
 */
public class Scheduler {

    private List<Command> commandList = new ArrayList<Command>();


    public void add(Command command) {
        commandList.add(command);
    }

    public void execute() {
        for (Command command : commandList) {
            command.execute();
        }

    }


}
