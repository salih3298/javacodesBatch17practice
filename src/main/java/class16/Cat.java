package class16;

public class Cat {

    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;
    private char gender;


    public Cat() {

    }

    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;

    }

    public Cat(String name, int age, double weight, String breed, String color) {
        this(name, age, weight);
        this.breed = breed;
        this.color = color;

    }

    public Cat(String name, int age, double weight, char gender, String breed, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.breed = breed;
        this.color = color;
        this.gender = gender;

    }

    void printInfo() {
        System.out.println(name + " " + breed + " " + color + " " + age + " " + weight+" "+gender);
    }

}
