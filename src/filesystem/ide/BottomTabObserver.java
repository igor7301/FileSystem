package filesystem.ide;

import filesystem.Observer;
import filesystem.file.MyFile;

/**
 * Created by Igor on 08.12.15.
 */
public class BottomTabObserver implements Observer {

    private MyFile file;

    @Override
    public void add(MyFile file) {
        file.addObserver(this);
        this.file = file;
    }

    @Override
    public void remove(MyFile file) {


    }

    @Override
    public void update() {

        System.out.println("Bottom tab - File has been changed: " + file.getName() );
    }
}
