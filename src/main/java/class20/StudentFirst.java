package class20;

public class StudentFirst {
    private String name;
    private String id;
    public StudentFirst(String name, String id) {
        this.name = name;
        this.id = id;
    }
    public void printInfo() {
        System.out.println(name + " " + id);
    }
}
