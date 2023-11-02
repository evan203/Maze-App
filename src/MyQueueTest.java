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
        Object b;
        try
        {
            b = queue.dequeue();
        }
        catch(NoSuchElementException e)
        {
            throw new NoSuchElementException();
        }
        boolean c = false;
        assertEquals(c, queue.dequeue());
    }
    
    @Test
    public void testFront() throws NoSuchElementException
    {
        Object b;
        try
        {
            b = queue.front();
        }
        catch(NoSuchElementException e)
        {
            throw new NoSuchElementException();
        }
        assertEquals(b, queue.front());
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
