package filesystem;

import java.util.List;

/**
 * Created by IKomarov on 01.12.2015.
 */
public interface FileSystem {

    List<FileSystemElement> getContent();

    FileSystemElement add(FileSystemElement element);

    String getName();

    void printInfo();

    void setName(String name);

}
