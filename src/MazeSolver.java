import java.util.ArrayList;

public abstract class MazeSolver 
{
    private Maze maze;

    abstract public void makeEmpty();

    abstract public boolean isEmpty();

    abstract public void add(Square sq);

    abstract public Square next();

    public boolean solved;
    
    MazeSolver(Maze maze)
    {
        this.maze = maze;
        solved = false;

    }

    public boolean isSolved()
    {
        return solved;
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
        if (current == null)
            // can't continue
            return null;
        current.type = 5;

        ArrayList<Square> neighbors = maze.getNeighbors(current);
        if (neighbors.size() == 0)
        {
            // this is a dead end
            // somehow go backwards to the previous 
            this.next(); // remove the last thing in worklist?
            this.add(current.getPreviousSquare());
        }
        for (Square s : neighbors)
        {
            if (s.getType() == 0)
            {
                s.setPreviousSquare(current);
                add(s);
            }
            if (s.getType() == 3)
                {
                // we found the end?
                solved = true;
                s.setPreviousSquare(current);
                add(s);
                }
        }

        return current;
    }

    public void solve()
    {
        while (!this.isSolved() || ! this.isEmpty())
        {
            step();
        }

    }
}
