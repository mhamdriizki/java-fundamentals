package oop;

public class HewanAsPolymorphism extends Inheritance {
    public HewanAsPolymorphism(String namaHewan) {
        super(namaHewan);
    }

    @Override
    public void makan() {
        System.out.println("Hewan " + super.namaHewan + " sedang makan dengan cara yang berbeda");
    }

}
