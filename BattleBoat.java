public class BattleBoat{

    private int size;
    private boolean orientation; //true = vertical, false = horizontal
    private Cell[] location;

    public BattleBoat(int size){
        this.size = size;

        double x = Math.random() * 10;
        x = (int)Math.floor(x);
        if(x % 2 == 0){
            orientation = true;//vertical
        } else {
            orientation = false;//horizontal
        }

        location = new Cell[size];
    }//constructor

    public int getSize(){
        return size;
    }//getSize

    public boolean getOrientation(){
        return orientation;
    }//getOrientation

    public Cell[] getLocation() {
        return location;
    }//getLocation

    public void setLocation(Cell coords, int idx){
        location[idx] = coords;

    }//setLocation


}//battleboat class