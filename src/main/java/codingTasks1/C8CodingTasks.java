package codingTasks1;

public class C8CodingTasks {
    public static void main(String[] args) {
        int[] numbers = {17, 32, 53, 5, 73, 24, 98, 40};

        for (int row = 0; row < numbers.length; row++) {
            System.out.print(numbers[row] + " ");
        }

        System.out.println();
        int maxNumber = numbers[0];
        int minNumber = numbers[0];
        for (int i : numbers) {
            if (i > maxNumber) {
                maxNumber = i;
            } else if (i < minNumber) {
                minNumber = i;

            }

        }
        System.out.println("max number is :" + maxNumber);
        System.out.println("min number is :" + minNumber);
    }
}

