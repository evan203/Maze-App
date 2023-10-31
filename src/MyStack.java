
import java.util.*;

public class MyStack implements StackADT
{
    private ArrayList list;

    public MyStack()
    {
        list = new ArrayList<>();
    }

    public void clear()
    {
        list = new ArrayList<>();
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
