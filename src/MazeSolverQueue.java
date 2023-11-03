public class MazeSolverQueue {
    private MyQueue<Square> stack;
    public MazeSolverQueue(Maze m)
    {
        super(m);
        stack = new MyQueue<Square>();
    }

    public void makeEmpty()
    {
        while (!stack.isEmpty())
            stack.pop();
    }
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    public void add(Square sq)
    {
        stack.push(sq);
    }
    public Square next()
    {
        return stack.top();
    }
    

    // methods that get a maze from the command-line argument, create the appropriate type of worklist, 
    // call the solve( ) method to find a solution and then print the resulting path, if there is one.
    public static void main (String[] args)
    {


    }

}
