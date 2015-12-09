package filesystem.directory;

import filesystem.WinFileSystem;

/**
 * Created by IKomarov on 01.12.2015.
 */
public class DirectoryFactory {

    public static Directory get(String fileSystemName, String dirName) {
        if(fileSystemName.equalsIgnoreCase("WIN")) {

            //------PROXY PATTERN ---------------------
            return new DirectoryWinProxy(dirName);
        }
        return null;
    }
}
