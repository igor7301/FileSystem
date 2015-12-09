package filesystem;

import filesystem.directory.Directory;

import java.util.List;

/**
 * Created by IKomarov on 30.11.2015.
 */
public interface FileSystemElement extends FileSystem{

    String getName();

    void copy(FileSystemElement element);


    void setParent(FileSystemElement parent);
}
