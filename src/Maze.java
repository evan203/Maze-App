import java.util.*;
import java.io.*;

class Maze
{
    private Square[][]  maze;
    private Square start;
    private Square finish;

    private String currentFName = null;

    public Maze()
    {

    }

    public boolean loadMaze(String fname) throws FileNotFoundException
    {
        currentFName = fname;
        boolean b = false;

        File f;
        try
        {
            f = new File(fname);
        }
        catch(Exception e)
        {
            System.out.println("There was a problem loading the maze file");
            throw new FileNotFoundException();
        }

        Scanner scn = new Scanner(f);

        String[] dimension = scn.nextLine().split(" ");

        int numRows = Integer.parseInt(dimension[0]);
        int numCols = Integer.parseInt(dimension[1]);

        maze = new Square[numRows][numCols];

        for (int row = 0; row < numRows; row++)
        {            
            String[] s = scn.nextLine().split(" ");
            for (int col = 0; col < numCols; col++)
            {
                maze[row][col] = new Square(row, col, Integer.parseInt(s[col]));
                
                if (maze[row][col].getType() == 2)
                    start = maze[row][col];
                else if (maze[row][col].getType() == 3)
                    finish = maze[row][col];
            }
        }

        b = true;
        return b;
    }

    public ArrayList<Square> getNeighbors(Square sq)
    {
        ArrayList<Square> neighbors = new ArrayList<Square>();

        if(sq.getRow() != 0) neighbors.add(maze[sq.getRow() - 1][sq.getCol()]);
        if(sq.getRow() != maze.length - 1) neighbors.add(maze[sq.getRow() + 1][sq.getCol()]);
        if(sq.getCol() != 0) neighbors.add(maze[sq.getRow()][sq.getCol() - 1]);
        if(sq.getCol() != maze[0].length - 1) neighbors.add(maze[sq.getRow()][sq.getCol() + 1]);

        return neighbors;
    }

    public Square getStart()
    {
        return start;
    }
    public Square getFinish()
    {
        return finish;
    }
    public void reset() throws FileNotFoundException
    {
        if (currentFName != null) loadMaze(currentFName);
    }

    public String toString()
    {
        String ans = "";
        for (Square[] row : maze)
        {
            for (Square s : row)
            {
                ans += s + " ";
            }
            ans += "\n";
        }

        return ans;
    }

}