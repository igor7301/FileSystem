package bulderpattern;

/**
 * Created by Igor on 03.12.15.
 */
public interface FileBuilder {
    FileBuilder setName(String name);

    FileBuilder setEmail(String email);

    String getResults();
}
