package iteratorpattern;

import filesystem.FileSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Igor on 06.12.15.
 */
public class IteratorFileSystem implements Iterator {
    private FileSystem fileSystem;
    private FileSystem fileSystemTmp;
    private FileSystem fileSystemPrev;
    private int currentPosInFileSystem = 0;
    private List<FileSystem> fileSystemList = new ArrayList<FileSystem>();


    public IteratorFileSystem(FileSystem fileSystemElement) {
        this.fileSystem = fileSystemElement;
        fileSystemTmp = fileSystemElement;
        fileSystemPrev = fileSystemElement;
        fileSystemList.add(fileSystemElement);


    }

    public void read() {


        if (fileSystemTmp.getContent() != null && fileSystemTmp.getContent().size() > 0) {
            fileSystemList.add(fileSystemTmp.getContent().get(0));
            fileSystemPrev = fileSystemTmp;
            fileSystemTmp = fileSystemTmp.getContent().get(0);

            read();

        }
        else {
            fileSystemTmp = fileSystemPrev;

            read();
        }

        for (FileSystem system : fileSystemList) {
            System.out.println(system.getName());
        }


    }

    @Override
    public boolean hasNext() {


        return true;


    }

    @Override
    public Object next() {

        FileSystem next = fileSystem.getContent().get(currentPosInFileSystem++);

        fileSystem = next;
        return next;


    }
}
