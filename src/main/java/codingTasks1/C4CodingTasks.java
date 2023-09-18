package codingTasks1;

public class C4CodingTasks {
    public static void main(String[] args) {
        int[][] numbers = {{25, 30, 45, 59},
                {20, 11, 22, 71},
                {15, 17, 50, 92},};
        int sumEven = 0;
        int sumOdd = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");
                    sumEven = sumEven + numbers[row][col];
                }

                if (numbers[row][col] % 2 != 0) {
                    System.out.print(numbers[row][col] + " ");
                    sumOdd = sumOdd + numbers[row][col];
                }

            }
            System.out.println();
        }
        System.out.println("total of even number: " + sumEven);
        System.out.println("total of odd number: " + sumOdd);
    }
}

