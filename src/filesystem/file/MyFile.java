package filesystem.file;

import filesystem.FileSystem;
import filesystem.FileSystemElement;
import filesystem.Observer;
import filesystem.ide.TopTabObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IKomarov on 30.11.2015.
 */
public class MyFile implements FileSystemElement {
    private List<Observer> observers = new ArrayList<Observer>();
    private String name;

    public MyFile(String name) {
        this.name = name;


    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
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
        System.out.println(name );
    }

    @Override
    public void setName(String name) {
        this.name = name;
        notifyAllObservers();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void copy(FileSystemElement element) {

    }

    @Override
    public void setParent(FileSystemElement element) {

    }


    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public class Memento {
        private String name;




    }
}
