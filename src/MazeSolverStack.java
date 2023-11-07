public class MazeSolverStack extends MazeSolver{
    
    private MyStack<Square> stack;
    public MazeSolverStack(Maze m)
    {
        super(m);
        stack = new MyStack<Square>();
        this.add(m.getStart());
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
        //System.out.println(stack.size() + " :: " + sq.getCol() + " " + sq.getRow());

    }
    public Square next()
    {
        //System.out.println("Size (next): " + stack.size());

        return stack.pop();
    }
    

    // methods that get a maze from the command-line argument, create the appropriate type of worklist, 
    // call the solve( ) method to find a solution and then print the resulting path, if there is one.
    public static void main (String[] args)
    {


    }

}
