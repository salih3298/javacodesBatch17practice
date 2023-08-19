package class6;

import java.util.Scanner;

public class H5_2ndWay {
    public static void main(String[] args) {

/*HW:  Using scanner class create calculator. Allow user to enter 2 numbers and operator(+,-,*,/).
Based on operator provide the result to user.
Please complete this assignment in 2 ways: using if statement and switch case.*/

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Please enter your operator");
        char operator = input.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("Not Acceptable");
                break;
        }
            }
        }

