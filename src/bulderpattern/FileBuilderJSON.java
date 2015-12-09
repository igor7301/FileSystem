package bulderpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Igor on 03.12.15.
 */
public class FileBuilderJSON implements FileBuilder {
    private List<String> res  = new ArrayList<String>();

    @Override
    public FileBuilder setName(String name) {
        res.add("name: " + name);
        return this;
    }

    @Override
    public FileBuilder setEmail(String email) {
        res.add("email: " + email);
        return this;
    }

    @Override
    public String getResults() {
        String res = "{ ";
        for (String elem : this.res) {
            res += elem + "; ";

        }

        return res + " }";
    }
}
