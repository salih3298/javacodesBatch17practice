package class7;

import java.util.Scanner;

public class E10WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter starting point");
int start= scanner.nextInt();
        System.out.println("Please enter ending point");
int end=scanner.nextInt();
        System.out.println("Please enter step point");
int step=scanner.nextInt();

while (start<=end ) {

    System.out.print(start+" ");
  start+=step;
  
    }
  }
}
