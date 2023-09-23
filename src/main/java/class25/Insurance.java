package class25;

public abstract class Insurance {
    String insuranceName;

    void getQuote() {
    }

    void cancelInsurance() {

    }
}

class Car extends Insurance {
    String carModel;

}

class Pet extends Insurance {
    String petType;
}

class Health extends Insurance {

}


