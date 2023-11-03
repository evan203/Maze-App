import java.util.NoSuchElementException;

public class MyQueue<T> implements QueueADT<T>
{
    private Node<T> first;

    /**
     * Constructs an empty stack.
    */
    public MyQueue()
    {
        first = null;
    }

    /**
     * Add an item to the queue
     * @param item the data item to add (of type T)
     */
    public void enqueue(T item)
    {
        Node<T> newItem = new Node<T>();
        newItem.data = item;

        if(first == null)
        {
            first = newItem;
        }
        else
        {
            Node<T> current = first;
            while(current.next != null)
            {
                current = current.next;
            }
            current.next = newItem;
        }
    }

    /**
     * Remove the front item from the queue
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T dequeue() throws NoSuchElementException
    {
        if (this.isEmpty())
        {
            throw new NoSuchElementException();
        }
        T item = first.data;
        first = first.next;
        return item;
    }

    /**
     * Return the front item in the queue without removing it
     * @return the front item in the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T front() throws NoSuchElementException
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
        Node<T> node = first;
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
    static class Node<T>
    {
        public T data;
        public Node<T> next;
    }
}
