

public abstract class MazeSolver 
{
    private Maze maze;

    abstract void makeEmpty();
    abstract boolean isEmpty();
    abstract void add(Square sq);
    abstract Square next();
    
    MazeSolver(Maze maze)
    {
        this.maze = maze;
    }
    boolean isSolved()
    {
        
    }
    String getPath()
    {

    }
    Square step()
    {

    }
    void solve()
    {
        while (step() != null)
        {
            step();
        }
    }
}
