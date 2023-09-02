package codingTasks;

public class C7CodingTasks {
    public static void main(String[] args) {

        int number1 = 0;
        int number2 = 1;
        int sum;


        System.out.print(number1);

        for(int i=1;i<10;++i){

            sum = number1 + number2;
            System.out.print(", " + number2);
            number1 = number2;
            number2= sum;

        }

    }
}

