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
        if (maze.getFinish().getPreviousSquare() != null || this.isEmpty())
            return true;

        return false;
    }

    public String getPath()
    {
        Square f = maze.getFinish();
        if (f.getPreviousSquare() == null)
            return "No such path";

        return getPath(f.getPreviousSquare()) + " [" + f.getCol() + "," + f.getRow() + "]";
    }
    private String getPath(Square s)
    {
        if (s.getPreviousSquare() == null)
            return "[" + s.getCol() + "," + s.getRow() + "]";

        s.type = 6;
        return getPath(s.getPreviousSquare()) + " [" + s.getCol() + "," + s.getRow() + "]";
    }

    public Square step()
    {
        Square current = next();
        if (current == null)
        {
            // can't continue
            return null;
        }
        if (current.getType() == 0)
            current.type = 5;

        ArrayList<Square> neighbors = maze.getNeighbors(current);
        for (Square s : neighbors)
        {
            if ((s.getType() == 0 || s.getType() == 3) && s.getPreviousSquare() == null)
            {
                s.setPreviousSquare(current);
                add(s);
            }
        }

        return current;
    }

    public void solve()
    {
        while (!this.isSolved())
        {
            step();
        }

    }
}
