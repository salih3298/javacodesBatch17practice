package class8;

import java.util.Scanner;

public class T6Repl {
    public static void main(String [] args){

        Scanner input=new Scanner(System.in);
        String [] array=new String [7];


        for (int i=1; i<8; i++){
            System.out.println("Please enter day "+i+" of the week");
          //  array= new String[] input.nextLine();
        }

        for (int i=0; i<7; i++) {
            System.out.println(array[i]);
        }




    }

}


