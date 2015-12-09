package commandpattern;

import filesystem.FileSystem;

/**
 * Created by Igor on 04.12.15.
 */
public class CommandPrintInfo implements Command {
    private FileSystem fileSystemElement;

    public CommandPrintInfo(FileSystem element) {
      this.fileSystemElement = element;
    }

    @Override
    public void execute() {
        fileSystemElement.printInfo();
    }
}
