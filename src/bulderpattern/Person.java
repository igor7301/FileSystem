package bulderpattern;

/**
 * Created by Igor on 03.12.15.
 */
public class Person {
    private String name;
    private String email;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void createFile(FileBuilder fileBuilder) {
        fileBuilder.setName(name).setEmail(email);
    }
}
