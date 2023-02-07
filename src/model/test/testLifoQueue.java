package test;

import model.FIFOQUEUE;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testLifoQueue {
    private FIFOQUEUE testFIFO;

    @BeforeEach
    void setUp() {
        testFIFO = new FIFOQUEUE();
    }

    @Test
    void testConstructor() {
        assertEquals(0, testFIFO.size());
    }

    @Test
    void testEnqueueOnce() {
        ArrayList<String> s = testFIFO.enqueue("A");
        assertEquals("A", s.get(0));
    }

    @Test
    void testEnqueueTwice() {
        ArrayList<String> s = testFIFO.enqueue("A");
        testFIFO.enqueue("B");
        assertEquals("A", s.get(0));
        assertEquals("B", s.get(1));
    }

    @Test
    void testDequeue() {
        ArrayList<String> s = testFIFO.enqueue("A");
        testFIFO.dequeue();
        assertEquals(0, testFIFO.size());
    }

    @Test
    void testDequeueTwice() {
        ArrayList<String> s = testFIFO.getStack();
        testFIFO.enqueue("A");
        testFIFO.enqueue("B");
        testFIFO.dequeue();
        assertEquals("B", s.get(0));
    }

    @Test
    void testGetStack() {
        testFIFO.enqueue("A");
        testFIFO.enqueue("B");
        testFIFO.enqueue("C");
        assertEquals(3, testFIFO.size());
    }

    @Test
    void testSize() {
        testFIFO.enqueue("A");
        testFIFO.enqueue("B");
        assertEquals(2, testFIFO.size());
    }
}

