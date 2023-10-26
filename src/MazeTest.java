import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class MazeTest {
    private Square square;

    @Before
    public void setUp() {
        // Initialize a Square object before each test
        square = new Square(2, 3, 1);
    }

    @Test
    public void testToString() {
        String expectedString = "#";
        assertEquals(expectedString, square.toString());
    }

    @Test
    public void testGetRow() {
        int expectedRow = 2;
        assertEquals(expectedRow, square.getRow());
    }

    @Test
    public void testGetCol() {
        int expectedCol = 3;
        assertEquals(expectedCol, square.getCol());
    }

    @Test
    public void testConstructorAndGetters() {
        int expectedRow = 2;
        int expectedCol = 3;
        int expectedType = 1;

        assertEquals(expectedRow, square.getRow());
        assertEquals(expectedCol, square.getCol());
        assertEquals(expectedType, square.getType());
    }

}
