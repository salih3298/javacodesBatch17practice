package Homework;

/* In Parent class.
Create a constructor, it will take a String parameter called city.
include the logic of printing the parameter value.
Create another constructor without parameter.
Include the logic of printing "Parent Constructor".
Create a Child Class that should be a subclass of Parent class
Inside child class create a constructor that will make a call to parameterized constructor of the parent class.
In Main class.
Create an Object of the child class by passing String value "Vienna"
**Expected Output:**

Vienna
*/
public interface H1Repl177 {
    void display();

}

interface Functions extends H1Repl177 {

    double adding(double firstNumber, double secondNumber);

    double subtracting(double firstNumber, double secondNumber);

    double multiply(double firstNumber, double secondNumber);

    double dividing(double firstNumber, double secondNumber);

    void display();
}

class MmMain implements Functions {


    @Override
    public double adding(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    @Override
    public double subtracting(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    @Override
    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    @Override
    public double dividing(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
    @Override
    public void display() {
        System.out.println("Result is ::: ");
    }

    public static void main(String[] args) {

        double firstNumber = 100.00;
        double secondNumber = 20.00;


        MmMain m = new MmMain();

        double addResult = m.adding(firstNumber, secondNumber);
        double subResult = m.subtracting(firstNumber, secondNumber);
        double mulResult = m.multiply(firstNumber, secondNumber);
        double divResult = m.dividing(firstNumber, secondNumber);

       // System.out.println();
       // m.display();
        System.out.println(addResult);

    }



}
