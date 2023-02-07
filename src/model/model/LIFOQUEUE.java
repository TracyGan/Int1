package model;

import java.util.ArrayList;

// Represents a queue last in, first out
public class LIFOQUEUE implements IQueuable {
    ArrayList<String> stack;

    public LIFOQUEUE() {
        stack = new ArrayList<String>();
    }

    @Override
    public ArrayList<String> enqueue(String value) {
        stack.add(value);
        return stack;
    }

    @Override
    public String dequeue() {
        String s = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return s;
    }

    @Override
    public ArrayList<String> getStack() {
        return stack;
    }

    @Override
    public int size() {
        return stack.size();
    }
}
