package adapterpattern;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Igor on 03.12.15.
 */
public class IteratorToEnumerationAdapter implements Iterator {
    Enumeration enumeration;

    public IteratorToEnumerationAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return  enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return  enumeration.nextElement();
    }

    @Override
    public void remove() {
        throw new RuntimeException("Implement me");
    }
}
