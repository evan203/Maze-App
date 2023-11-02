import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyQueueTest 
{
    private MyQueue queue;

    @Before
    public void setUp() 
    {
        queue = new MyQueue();
    }

    @Test
    public void testEnqueue() 
    {
        String s1 = "test";
        queue.enqueue(s1);
        String s2 = "test";
        queue.enqueue(s2);
        boolean c = false;
        assertEquals(c, queue.isEmpty());
    }

    @Test
    public void testDequeue() throws NoSuchElementException
    {
        String s1 = "t";
        String s2 = "t";
        queue.enqueue(s1);
        queue.enqueue(s2);
        assertEquals(s1, queue.dequeue());
        assertEquals(s1, queue.front());
    }
    
    @Test
    public void testFront() throws NoSuchElementException
    {
        String s = "t";
        queue.enqueue(s);
        assertEquals(s, queue.front());
    }

    @Test
    public void testSize() 
    {
        int size = 0;
        assertEquals(size, queue.size());
    }

    @Test
    public void testIsEmpty() 
    {
        boolean empty = true;
        assertEquals(empty, queue.isEmpty());
    }

    @Test
    public void testClear() 
    {
        boolean empty = true;
        assertEquals(empty, queue.isEmpty());
    }
}
