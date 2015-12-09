package commandpattern;

import filesystem.directory.Directory;

/**
 * Created by Igor on 04.12.15.
 */
public class CommandCopyDirectory implements Command {

    private Directory toDir;
    private Directory fromDir;


    public CommandCopyDirectory(Directory toDir, Directory fromDir) {
        this.toDir = toDir;
        this.fromDir = fromDir;
    }

    @Override
    public void execute() {
        toDir.copy(fromDir);
    }
}
