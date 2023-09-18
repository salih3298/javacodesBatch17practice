package codingTasks1;

public class C2CodingTasks {
    public static void main(String[] args) {
        int[][] numbers = {{32, 98, 53},
                {44, 41, 72},
                {18, 40, 80},};
        int sum = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                sum = sum + numbers[row][col];

            }
        }
        System.out.println("sum of all stored element :" + sum);

    }
}

