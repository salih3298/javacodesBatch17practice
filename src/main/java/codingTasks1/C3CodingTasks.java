package codingTasks1;

public class C3CodingTasks {
    public static void main(String[] args) {
        int[][] numbers = {{25, 30, 45, 59},
                {20, 11, 22, 71},
                {15, 17, 50, 92},};

        for (int row=0;row< numbers.length;row++){
            for (int col=0; col< numbers[row].length;col++){
                if (numbers[row][col]%2==0){
                    System.out.print(numbers[row][col]+" ");
                }

            }System.out.println();
        }

    }
}

