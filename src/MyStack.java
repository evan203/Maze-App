
import java.util.*;

public class MyStack<T> implements StackADT<T>
{
    private ArrayList<T> list;

    public MyStack()
    {
        list = new ArrayList<T>();
    }

    public void clear()
    {
        list = new ArrayList<T>();
    }

    public int size()
    {
        return list.size();
    }

    public boolean isEmpty()
    {
        return list.size() == 0;
    }

    public T top() throws NoSuchElementException
    {
        if (list.size() == 0)
            return null;
        try
        {
            return list.get(list.size() - 1);
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Element does not exist!");
            return null;
        }
    }  
    
    public T pop() throws NoSuchElementException
    {
        try
        {
            return list.remove(list.size() - 1);
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Element does not exist!");
            return null;
        }
    } 

    public void push(T s)
    {
        list.add(s);
    }
}
