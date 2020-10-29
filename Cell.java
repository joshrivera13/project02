public class Cell{

    public int row;
    public int col;
    public char status;

    public Cell(int row, int col, char status){
        this.row = row;
        this.col = col;
        this.status = status;
    }//constructor

    public char getStatus(){
        return status;
    }//getStatus

    public void setStatus(char c){
        status = c;
    }//setStatus


}//cell class