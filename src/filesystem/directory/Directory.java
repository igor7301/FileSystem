package filesystem.directory;

import filesystem.FileSystemElement;

import java.util.List;

/**
 * Created by IKomarov on 01.12.2015.
 */
public interface Directory extends FileSystemElement{

    FileSystemElement getParent();


}
