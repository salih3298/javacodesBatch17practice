package class19;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }

}

class Bachelors extends Degree {
}

class Masters extends Degree {

    void getPrerequisite() {
        System.out.println("To get a masters degree you need university diploma");
    }
}

class Tester {
    public static void main(String[] args) {
        Masters m = new Masters();
        m.getPrerequisite();

        Bachelors b = new Bachelors();
        b.getPrerequisite();

        Degree d = new Degree();
        d.getPrerequisite();
    }
}

