package class5;

import java.util.Scanner;

public class R20Scanner {
    public static void main(String[] args){
        //Scanner input=new Scanner(System.in);
        System.out.println("Please Enter First Name");
        Scanner input1=new Scanner(System.in);
        String firstName=input1.next();
        System.out.println("Please Enter Last Name");
        Scanner input2=new Scanner(System.in);
        String lastName=input2.next();
        System.out.println(firstName+" "+lastName);
    }

}

