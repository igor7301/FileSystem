package filesystem;

/**
 * Created by IKomarov on 01.12.2015.
 */
public class FileSystemFactory {

    public static FileSystem get(String fileSystemName) {
      if(fileSystemName.equalsIgnoreCase("WIN")) {
          return new WinFileSystem();
      }
        return null;
    }

}
