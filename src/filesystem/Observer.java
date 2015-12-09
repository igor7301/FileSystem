package filesystem;

import filesystem.file.MyFile;

/**
 * Created by Igor on 08.12.15.
 */
public interface Observer {

    void add(MyFile file);
    void remove(MyFile file);
    void update();

}
