package at.campus02.iterator;

import java.util.Iterator;

public class ZamIterator implements Iterator<String> {

    private String[] words;
    private int position;

    public ZamIterator(String[]text){
        this.words=text;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        if (position < words.length)
            return true;
        return false;
    }

    @Override
    public String next() {
        position++;
       String k = words[position -1];
       return k;

    }
}
