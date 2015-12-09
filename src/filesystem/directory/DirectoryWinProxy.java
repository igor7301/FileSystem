package filesystem.directory;

import filesystem.FileSystemElement;

import java.util.List;

/**
 * Created by Igor on 03.12.15.
 */
public class DirectoryWinProxy implements Directory {

    //отложенное создание объекта директория
    //создаем директорию только при первом обращении к методам объекта директория

    private String dirName;
    private DirectoryWin directory;
    private FileSystemElement parent;


    public DirectoryWinProxy(String dirName) {
        this.dirName = dirName;
    }

    private DirectoryWin create() {
        if (directory == null) {
            directory = new DirectoryWin(dirName);
            return directory;
        }

        return directory;
    }

    @Override
    public String getName() {
        create();
        return  directory.getName();
    }

    @Override
    public void copy(FileSystemElement element) {
        create();
        directory.copy(element);

    }

    @Override
    public void setParent(FileSystemElement parent) {

    }

    @Override
    public List<FileSystemElement> getContent() {
        create();
        return directory.getContent();
    }

    @Override
    public FileSystemElement add(FileSystemElement element) {
        create();
        return directory.add(element);
    }

    @Override
    public void printInfo() {
        create();
        directory.printInfo();

    }

    @Override
    public void setName(String name) {
        create();
        this.dirName = name;
    }

    @Override
    public FileSystemElement getParent() {
        create();
        return this.parent;
    }
}
