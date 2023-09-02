package class8;

public class T3Arrays {
    public static void main(String[] args) {

        int [] nums={10,77,25,56,60,-10,-5};
        for (int n:nums) {
            if (n<0) {
                n=0;
            }
            System.out.println(n);



        }
    }
}
