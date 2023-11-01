import java.util.NoSuchElementException;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue implements QueueADT
{
    private Node first;
    private Node last;

    /**
     * Constructs an empty stack.
    */
    public MyQueue()
    {
        first = null;
        last = null;
    }

    /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */
    public void enqueue(Object item)
    {
        Node newNode = new Node();
        newNode.data = item;
        newNode.next = null;
        last = newNode;
    }

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Object dequeue() throws NoSuchElementException
    {
        if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        Object item = first.data;
        first = first.next;
        return item;
    }

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public Object front() throws NoSuchElementException
    {
        if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        return first.data;
    }

    /**
     * Find how many items are in the queue
     * @return the number of items in the queue
     */
    public int size()
    {
        int count = 0;
        Node node = first;
        while (node != null)
        {
            node = node.next;
            count++;
        }
        return count;
    }

    /**
     * Determine if the queue is empty
     * @return true if the size is 0, false otherwise
     */
    public boolean isEmpty()
    {
        return first == null;
    }

    /**
     * Clear out the data structure
     */
    public void clear()
    {
        while (!isEmpty())
        {
            dequeue();
        }
    }

    // Class Node
    // Node is a static class because it doesn't have to access
    // anything in Linked List
    static class Node
    {
        public Object data;
        public Node next;
    }
}
