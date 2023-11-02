

public abstract class MazeSolver 
{
    abstract void makeEmpty();
    abstract boolean isEmpty();
    abstract void add(Square sq);
    abstract Square next();
    
    MazeSolver(Maze maze)
    {

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
