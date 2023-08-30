package class12;

public class T4MethodsPrimeNumber {
    //Write a method to return whether given number is prime or not?

    boolean primeNumber(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}





    /*int primeNumber(int num) {
        if (num == 2 || num > 1 && num % 2 != 0 || num % 3 != 0 && num % 5 != 0 || num % 7 != 0 || num % 11 != 0 ||
        num % 13 != 0 || num % 17 != 0 || num % 19 != 0){
            System.out.println(num + " is a prime number");
        } else{
            System.out.println(num + " is not a prime number");
        }
        return num;
    }*/
