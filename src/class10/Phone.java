package class10;

public class Phone {
    String model;
    int memory;
    int camera;
    double weight;
    double price;

    void photo (){
        System.out.println("Shots very good pictures");
    }
    void battery (){
        System.out.println("Battery works better");
    }
    public static void main(String[] args) {

    Phone iphone=new Phone();
    iphone.model="14 Pro max";
    iphone.memory=256;
    iphone.camera=100;
    iphone.weight=152;
    iphone.price=1312;

    Phone samsung=new Phone();
    samsung.model="S22";
    samsung.memory=256;
    samsung.camera=120;
    samsung.weight=112;
    samsung.price=899;

    Phone pixel=new Phone();
    pixel.model="c47d";
    pixel.memory=128;
    pixel.camera=100;
    pixel.weight=170;
    pixel.price=689;

        System.out.println(iphone.model);
        System.out.println(pixel.model);
        System.out.println(samsung.model);
        System.out.println(iphone.camera);


    }
}
