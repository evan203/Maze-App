import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MyStackTest {
    private MyStack stack;

    @Before
    public void setUp() {
        // Initialize a Square and Maze object before each test
        stack = new MyStack();
    }
    
    @Test
    public void testIsEmptyAndSize() {
        assertEquals(stack.size() == 0, stack.isEmpty());
    }

    @Test
    public void testSizeAndClear()
    {
        stack.clear();
        assertEquals(true, stack.size() == 0);
    }

    @Test
    public void testPushAndTopAndPop()
    {
        String s = "Hello, world!";
        stack.push(s);
        assertEquals(s, stack.top(), stack.pop());
    }


    
}
