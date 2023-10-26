public class Square {
    int row;
    int col;
    int type;
    public Square(int row, int col, int type)
    {
        this.row = row;
        this.col = col;
        this.type = type;

    }
    public String toString(){
        switch (this.type)
        {
            case 0:
                return "_";
            case 1:
                return "#";
            case 2:
                return "s";
            case 3:
                return "e";
            case 4:
                return "o"; // is on the solver work list
            case 5:
                return "."; // has been explored
            case 6:
                return "x"; // is on the final path to the exit
            default:
                return " ";
        }
    }
    public int getRow() {return this.row;}
    public int getCol() {return this.col;}
    public int getType() {return this.type;}


}