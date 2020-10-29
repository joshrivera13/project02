/**
For office hours visit
 Explain placeBoats method
 Main problem is that the while loop isnt catching coords that are outside the range of the array

**/
public class BattleBoatsBoard{

    private Cell[][] gameBoard;
    private int totalShots;
    private int turn;
    private BattleBoat[] boatList;
    private int boatsRemaining;

    public BattleBoatsBoard(int size){
        gameBoard = new Cell[size][size];
        for (int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard[0].length; j++){
                Cell boardCell = new Cell(i, j, '-');
                gameBoard[i][j] = boardCell;
            }//inner for
        }//outer for
        totalShots = 0;
        turn = 0;
        if (size == 8){
            boatsRemaining = 5;
            boatList = new BattleBoat[1];
            BattleBoat boat50 = new BattleBoat(5);
            //BattleBoat boat40 = new BattleBoat(4);
            //BattleBoat boat30 = new BattleBoat(3);
            //BattleBoat boat31 = new BattleBoat(3);
            //BattleBoat boat20 = new BattleBoat(2);

            boatList[0] = boat50;
            //boatList[1] = boat40;
            //boatList[2] = boat30;
            //boatList[3] = boat31;
            //boatList[4] = boat20;
        }//standard mode
        else {
            boatsRemaining = 10;
            boatList = new BattleBoat[10];
        }

    }//constructor

    public String print(){
        String printedBoard = "";
        for (int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard[0].length; j++){
                printedBoard = printedBoard + " " + gameBoard[i][j].getStatus();
                if (j == gameBoard[0].length - 1){
                    printedBoard = printedBoard + "\n";
                }//if statement
            }//inner for
        }//outer for
        return printedBoard;
    }//print


    public void placeBoats(){

        for (int i = 0; i < boatList.length; i++){
            //vertical boats
            if (boatList[i].getOrientation() == true){
                boolean boatCheck = false;
                boolean fitCheck = false;
                int boatX = 0;
                int boatY = 0;

                while (boatCheck == false && fitCheck == false){
                    //get first coords
                    double x, y;
                    int xInt, yInt;
                    x = Math.random() * 10;
                    if (x > gameBoard.length){
                        x = x - 2;
                    }
                    y = Math.random() * 10;
                    if (y > gameBoard.length){
                        y = y - 2;
                    }
                    xInt = (int)Math.floor(x);
                    yInt = (int)Math.floor(y);
                    //checking if boat fits
                    if (boatList[i].getSize() + xInt < gameBoard.length){
                        fitCheck = true;
                    }
                    //checking if there are other boats in the way
                    for (int b = xInt; b < gameBoard.length; b++){
                        if(b == (gameBoard.length - 1) && gameBoard[b][yInt].getStatus() != 'B'){
                            boatCheck = true;
                        }
                    }//for
                    boatX = xInt;
                    boatY = yInt;
                }//while loop
                /**
                //getting rest of the coordinates
                for (int c = 0; c < boatList.length; c++){
                    for (int j = 0; j < boatList[c].getSize(); j++){
                        boatList[c].setLocation(gameBoard[boatX + j][boatY], j);
                        gameBoard[boatX + j][boatY].setStatus('B');
                    }//for loop for boat cell array
                }//for loop for going thru boatList
                 **/
                System.out.println("X: " + boatX + "\n" + "Y: " + boatY + "\n");
            }//if vertical

            //horizontal boats
             else if (boatList[i].getOrientation() == false){
                boolean boatCheck = false;
                boolean fitCheck = false;
                int boatX = 0;
                int boatY = 0;
                while (boatCheck == false && fitCheck == false){
                    //get first coords
                    double x, y;
                    int xInt, yInt;
                    x = Math.random() * 10;
                    if (x > gameBoard.length){
                        x = x - 2;
                    }
                    y = Math.random() * 10;
                    if (y > gameBoard.length){
                        y = y - 2;
                    }
                    xInt = (int)Math.floor(x);
                    yInt = (int)Math.floor(y);
                    //checking if boat fits
                    if (boatList[i].getSize() + yInt < gameBoard[0].length){
                        fitCheck = true;
                    }
                    //checking if there are other boats in the way
                    for (int b = yInt; b < gameBoard.length; b++){
                        if(b == (gameBoard.length - 1) && gameBoard[xInt][b].getStatus() != 'B'){
                            boatCheck = true;
                        }
                    }//for
                    boatX = xInt;
                    boatY = yInt;
                }//while loop
                /**
                //getting rest of the coordinates
                for (int c = 0; c < boatList.length; c++){
                    for (int j = 0; j < boatList[c].getSize(); j++){
                        boatList[c].setLocation(gameBoard[boatX][boatY + j], j);
                        gameBoard[boatX][boatY + j].setStatus('B');
                    }//for loop for boat cell array
                }//for loop for going thru boatList
                 **/
                System.out.println("X: " + boatX + "\n" + "Y: " + boatY + "\n");
            }//if horizontal
        }//for

    }//placeBoats






    public static void main(String[]args){
        BattleBoatsBoard testGame = new BattleBoatsBoard(8);
        testGame.placeBoats();
        System.out.println(testGame.print());
    }

}//BattleBoatsBoard class