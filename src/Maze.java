import java.util.*;
import java.io.*;

class Maze
{
    private Square[][]  maze;

    public Maze()
    {

    }

    boolean loadMaze(String fname)
    {
        File f = new File(fname);
        Scanner scn = new Scanner(f);

        String[] dimension = scn.nextLine().split(" ");

        int numRows = Integer.parseInt(dimension[0]);
        int numCols = Integer.parseInt(dimension[1]);

        maze = new Square[numRows][numCols];

        for (int row = 0; row < numRows; row++)
        {            
            String[] s = scn.nextLine().split(" ");
            for (int col; col < numCols; col++)
            {
                maze[row][col] = new Square(row, col, Integer.parseInt(s[col]));
            }
        }
    }

    ArrayList<Square> getNeighbors(Square sq)
    {
        
    }
    Square getStart()
    {

    }
    Square getFinish()
    {

    }
    void reset()
    {

    }
    String toString
    {

    }

}