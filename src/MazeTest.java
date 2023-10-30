import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class MazeTest {
    private Square square;
    private Maze maze;

    @Before
    public void setUp() {
        // Initialize a Square object before each test
        square = new Square(2, 3, 1);
        maze = new Maze();
    }

    @Test
    public void testLoadMaze() {
        String mazeFile = "src/maze-1";
        boolean expectedCondition = true;
        assertEquals(expectedCondition, maze.loadMaze(mazeFile));
    }

    @Test
    public void testGetNeighbors() {
        square = new Square(2, 3, 1);
        ArrayList<Square> neighbors= new ArrayList<>();
        assertEquals(neighbors, maze.getNeighbors(square));
    }

    @Test
    public void testGetStart() {
        square = new Square(2, 3, 1);
        assertEquals(square, maze.getStart());
    }

    @Test
    public void testGetFinish() {
        square = new Square(2, 3, 1);
        assertEquals(square, maze.getFinish());
    }

    @Test
    public void testReset() {
        maze.reset();
    }

    @Test
    public void testToStringMaze() {
        String expectedString = "#";
        assertEquals(expectedString, maze.toString());
    }

    @Test
    public void testToStringSquare() {
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
