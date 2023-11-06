public class MazeSolverQueue extends MazeSolver{
    private MyQueue<Square> queue;
    public MazeSolverQueue(Maze m)
    {
        super(m);
        queue = new MyQueue<Square>();
    }

    public void makeEmpty()
    {
        while (!queue.isEmpty())
            queue.dequeue();
    }
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
    public void add(Square sq)
    {
        queue.enqueue(sq);
    }
    public Square next()
    {
        return queue.front();
    }
    

    // methods that get a maze from the command-line argument, create the appropriate type of worklist, 
    // call the solve( ) method to find a solution and then print the resulting path, if there is one.
    public static void main (String[] args)
    {


    }

}
