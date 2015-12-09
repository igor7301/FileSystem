package filesystem.link;

import filesystem.FileSystemElement;

import java.util.List;

/**
 * Created by IKomarov on 30.11.2015.
 */
public class MyLink implements FileSystemElement {

    private String name;

    public MyLink(String name) {
        this.name = name;
    }


    @Override
    public List<FileSystemElement> getContent() {
        return null;
    }

    @Override
    public FileSystemElement add(FileSystemElement element) {
        return null;
    }


    @Override
    public void printInfo() {

        System.out.println(name);
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
