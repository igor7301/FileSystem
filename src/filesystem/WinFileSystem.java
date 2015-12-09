package filesystem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IKomarov on 30.11.2015.
 */
public class WinFileSystem implements filesystem.FileSystemElement {
    private String name = "WINDOWS";
    public List<FileSystemElement> fileSystemElements = new ArrayList<FileSystemElement>();

    @Override
    public List<FileSystemElement> getContent() {
        return fileSystemElements;
    }

    @Override
    public FileSystemElement add(FileSystemElement element) {
        element.setParent(this);
        fileSystemElements.add(element);
        return this;
    }


    @Override
    public void printInfo() {
        for (FileSystemElement elem : fileSystemElements) {

            elem.printInfo();
        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
         return this.name;
    }

    @Override
    public void copy(FileSystemElement element) {

    }

    @Override
    public void setParent(FileSystemElement parent) {

    }

}
