package filesystem.directory;

import filesystem.FileSystemElement;

import java.util.*;

/**
 * Created by IKomarov on 30.11.2015.
 */
public class DirectoryWin implements Directory {
    public List<FileSystemElement> container = new ArrayList<FileSystemElement>();

    private String name;
    private FileSystemElement parent;

    public DirectoryWin(String name) {
        this.name = name;
    }


    @Override
    public FileSystemElement add(FileSystemElement element) {
        element.setParent(this);
        container.add(element);
        return this;
    }


    @Override
    public void printInfo() {



        System.out.println(getName());
        for (FileSystemElement element : container) {

            System.out.println("below element from directory " + getName());
            element.printInfo();
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
    public void copy(FileSystemElement directoryForCopy) {

        for (FileSystemElement elements : ((Directory) directoryForCopy).getContent()) {
            container.add(elements);
        }


    }

    @Override
    public void setParent(FileSystemElement parent) {
        this.parent = parent;
    }

    @Override
    public List<FileSystemElement> getContent() {
        return container;
    }

    @Override
    public FileSystemElement getParent() {

        return this.parent;
    }
}
