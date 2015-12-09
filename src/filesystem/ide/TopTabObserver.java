package filesystem.ide;

import filesystem.Observer;
import filesystem.file.MyFile;

/**
 * Created by Igor on 08.12.15.
 */
public class TopTabObserver implements Observer{

    private MyFile file;

    @Override
    public void add(MyFile file) {

        this.file = file;
        file.addObserver(this);

    }

    @Override
    public void remove(MyFile file) {

        file.removeObserver(this);

    }

    @Override
    public void update() {

        System.out.println("Top tab - File has been changed: " + file.getName() );
    }
}
