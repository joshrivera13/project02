public class Testing{




    public static void main(String[]args){
        int x = 0;
        int counter = 0;
        while (counter < 6){
            double randDou = Math.random() * 8 - 4;
            x = (int)Math.floor(randDou);
            if (x < 0){
                x = x * (-1);
            }
            System.out.println(x);
            counter++;
        }








    }//main
}