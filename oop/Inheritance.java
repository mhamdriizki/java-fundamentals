package oop;

public class Inheritance {
    private String namaHewan;

    public Inheritance(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void makan() {
        System.out.println(namaHewan + " sedang makan");
    }
}
