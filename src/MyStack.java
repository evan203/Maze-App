
import java.util.*;

public class MyStack<T> implements StackADT
{
    private ArrayList list;

    T obj;

    public MyStack(T obj)
    {
        this.obj = obj;
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

    public Object top() throws NoSuchElementException
    {
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
    
    public Object pop() throws NoSuchElementException
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

    public void push(Object s)
    {
        list.add(s);
    }
}
