package class8;

public class E7EnhancedLoops {
    public static void main(String[] args) {

int [] nums={10,77,25,56,-10,-5};

int smallest =nums[0];

        for (int n:nums) {
            if (n<smallest) {
                smallest=n;
            }



        }

        System.out.println(smallest);

    }
}
