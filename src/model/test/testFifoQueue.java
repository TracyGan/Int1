package test;

import model.LIFOQUEUE;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testFifoQueue {
    private LIFOQUEUE testLIFO;

    @BeforeEach
    void setUp() {
        testLIFO = new LIFOQUEUE();
    }

    @Test
    void testConstructor() {
        assertEquals(0, testLIFO.size());
    }

    @Test
    void testEnqueueOnce() {
        ArrayList<String> s = testLIFO.enqueue("A");
        assertEquals("A", s.get(0));
    }

    @Test
    void testEnquenceTwice() {
        ArrayList<String> s = testLIFO.enqueue("A");
        testLIFO.enqueue("B");
        assertEquals("A", s.get(0));
        assertEquals("B", s.get(1));
    }

    @Test
    void testDequeueOnce() {
        ArrayList<String> s = testLIFO.enqueue("A");
        testLIFO.dequeue();
        assertEquals(0, s.size());
    }

    @Test
    void testDequeueTwice() {
        ArrayList<String> s = testLIFO.getStack();
        testLIFO.enqueue("A");
        testLIFO.enqueue("B");
        testLIFO.enqueue("C");
        testLIFO.dequeue();
        assertEquals("B", s.get(1));
        assertEquals("A", s.get(0));
    }

    @Test
    void testGetStack() {
        testLIFO.enqueue("A");
        testLIFO.enqueue("B");
        testLIFO.enqueue("C");
        assertEquals(3, testLIFO.size());
    }

    @Test
    void testGetSize() {
        testLIFO.enqueue("A");
        testLIFO.enqueue("B");
        assertEquals(2, testLIFO.size());
    }

}

