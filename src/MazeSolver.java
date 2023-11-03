import java.util.ArrayList;

public abstract class MazeSolver 
{
    private Maze maze;

    abstract public void makeEmpty();

    abstract public boolean isEmpty();

    abstract public void add(Square sq);

    abstract public Square next();
    
    MazeSolver(Maze maze)
    {
        this.maze = maze;
    }

    public boolean isSolved()
    {
        boolean solve;
        ArrayList<Square> neighbors = maze.getNeighbors(maze.getFinish());
        for (Square s : neighbors)
        {
            if (s.getType() == 6)
            {
                return true;
            }
        }

        if (step() == null)
        {
            return true;
        }

        return false;
    }

    public String getPath()
    {

        Square n = null;

        String path = "";
        Square square = maze.getFinish();
        for (Square s : maze.getNeighbors(square))
        {
            if (s.getType() == 1)
            {
                n = s;
            }
        }
        if (n == null) return null;

        while (n != null)
        {
            // add n's coordinates to the path string
            String cords = "[" + n.col + "," + n.row + "]";
            path = cords + " " + path;

            n = n.getPreviousSquare();
        }
        
        return "No such path";
    }


    public Square step()
    {
        Square current = next();
        current.type = 5;

        ArrayList<Square> neighbors = maze.getNeighbors(current);
        for (Square s : neighbors)
        {
            if (s.getType() == 0)
            {
                s.setPreviousSquare(current);
                add(s);
            }
        }

        return current;
    }

    public void solve()
    {
        while (step() != null)
        {
            step();
        }
    }
}
