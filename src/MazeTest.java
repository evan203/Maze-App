import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
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

    @Before
    public void testLoadMaze() throws FileNotFoundException {
        String mazeFile = "src/maze-1";
        boolean b;
        try{
            b = maze.loadMaze(mazeFile);
        }
        catch(FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
        boolean expectedCondition = true;
        assertEquals(expectedCondition, b);
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
    public void testReset() throws FileNotFoundException{
        try{
            maze.reset();
        }
        catch(FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
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
