package codingTasks;

public class C9CodingTasks {
    public static void main(String[] args) {
        int [] numbers={17, 32, 53, 5, 73, 24, 98, 40};
        int  maxNumber=numbers[0];
        int secondNumber=numbers[1];
        for (int i:numbers){
            if(i>maxNumber){
                secondNumber=maxNumber;
                maxNumber=i;}
            else if (i>secondNumber&&i<maxNumber) {
                secondNumber=i;
            }
        }
        System.out.println("second number :"+secondNumber);

    }
}

