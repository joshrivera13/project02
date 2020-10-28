public class BattleBoatsBoard{

    private Cell[][] gameBoard;
    private BattleBoat[] boats;
    private int totalShots;
    private int turn;
    private int boatsRemaining;

    public BattleBoatsBoard(int size){
        if (size == 8){
            gameBoard = new Cell[8][8];
            boats = new BattleBoat[5];
            totalShots = 0;
            turn = 0;
            boatsRemaining = 0;
            for (int i = 0; i < gameBoard.length; i++){
                for (int j = 0; j < gameBoard[0].length; j++){
                    Cell boardCell = new Cell(i, j, '-');
                }//inner for
            }//outer for
        }//if statement
    }//constructor

    public String print(){
        String printedBoard = "";
        for (int i = 0; i < gameBoard.length; i++){
            for (int j = 0; j < gameBoard[0].length; j++){
                printedBoard = printedBoard + " " + gameBoard[i][j].getStatus();
                if (j == gameBoard[0].length){
                    printedBoard = printedBoard + "\n";
                }//if statement
            }//inner for
        }//outer for
        return printedBoard;
    }//print



    public static void main(String[]args){
        BattleBoatsBoard testGame = new BattleBoatsBoard(8);
        System.out.println(testGame.print());
    }

}//BattleBoatsBoard class