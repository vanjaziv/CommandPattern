package at.campus02.iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ZamList implements Iterable<String>{

    private String[] text;

    public ZamList(String s) {
      this.text = s.split(" ");
        System.out.println("ZamList ersttelt mit text \"" + s + "\".");
    }

    @Override
    public Iterator iterator() {
        return new ZamIterator(text);
    }
}
