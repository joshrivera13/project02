public class Testing{


    public static String findFor(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (i == 3){
                return "Found it!";
            }
            System.out.println(i);
        }
        return "Didnt find it.";
    }


    public static void main(String[]args){

        int x = 0;
        int counter = 0;
        while (counter < 6){
            int temp = 0;
            temp = temp + 2;
            System.out.println(temp);
            x = temp;
            counter++;
        }
        System.out.println(x);


    }//main
}