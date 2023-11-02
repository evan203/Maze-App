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
            if (s.getType() == 3)
            {
                return true;
            }
        }
        return false;
    }

    public String getPath()
    {
        if(isSolved())
        {
            String path;
            
        }
        else 
        {
            return "No such Path";
        }
    }

    public Square step()
    {

    }

    public void solve()
    {
        while (step() != null)
        {
            step();
        }
    }
}
