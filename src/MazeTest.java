import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

public class MazeTest {
    private Square square;
    private Maze maze;

    @Before
    public void setUp() {
        // Initialize a Square and Maze object before each test
        square = new Square(2, 3, 1);
        maze = new Maze();

    }

    @Before
    public void testLoadMaze() {
        String mazeFile = "src/maze-1";
        assertEquals(true, maze.loadMaze(mazeFile));
    }

    @Test
    public void testGetNeighbors() {
        square = new Square(2, 2, 1);
        assertEquals("[_, _]", maze.getNeighbors(square).toString());
    }

    @Test
    public void testGetStart() {
        assertEquals(2, maze.getStart().getType());
    }

    @Test
    public void testGetFinish() {
        assertEquals(3, maze.getFinish().getType());
    }

    @Test
    public void testReset() throws FileNotFoundException{
        maze.reset();
        // does the maze thats just been reset contain an characters that shouldn't be there?
        // store the toString of maze into a string vraibale
        String s = maze.toString();
        Boolean b = false;
        for (Character ch : s.toCharArray())
            if (ch == 'o' || ch == '.' || ch == 'x')
            {
                    b = true;
                    break;
            }

        assertEquals(false, b);
    }

    @Test
    public void testToStringMaze() {
        String expectedString = "s _ _ \n_ _ _ \n_ _ e \n";
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
