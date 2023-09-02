package class12;

public class T2Methods {

    public void largest(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + "is larger");
        } else {
            System.out.println(num2 + " is larger");
        }

    }

    int getLarger(int num1, int num2) {

        int res;
        if (num1 > num2) {
            res = num1;
        } else {
            res = num2;
        }
        return res;
    }
}

