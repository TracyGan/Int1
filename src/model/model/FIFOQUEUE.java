package model;

import java.util.ArrayList;

// Represents a queue that is first in and first out
public class FIFOQUEUE implements IQueuable {

    ArrayList<String> queue;

    public FIFOQUEUE() {
        queue = new ArrayList<String>();
    }

    @Override
    public ArrayList<String> enqueue(String value) {
        queue.add(value);
        return queue;
    }

    @Override
    public String dequeue() {
        String s = queue.get(0);
        queue.remove(0);
        return s;
    }

    @Override
    public ArrayList<String> getStack() {
        return queue;
    }

    @Override
    public int size() {
        return queue.size();
    }
}