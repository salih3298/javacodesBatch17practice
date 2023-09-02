package class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your full name");
      //  String name =scanner.next(); bu sadece ilk boşluğa kadar alır
        String name =scanner.nextLine();   //bu komut tüm yazılanı alır
        System.out.println("Your full name is "+name);

    }
}
