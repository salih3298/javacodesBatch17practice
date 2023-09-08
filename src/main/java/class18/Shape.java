package class18;

public class Shape {
    double radius = 3;


}

class circle extends Shape {

    void area() {
        double area = Math.round(radius * radius * Math.PI);
        System.out.println("Area of circle : " + area);
    }
}

class test {
    public static void main(String[] args) {
        circle obj = new circle();
        obj.area();

    }
}