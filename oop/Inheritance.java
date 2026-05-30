package oop;

public class Inheritance {
    // Perlu dibuat protected agar bisa diakses oleh class yang mewarisi
    protected String namaHewan;

    public Inheritance(String namaHewan) {
        this.namaHewan = namaHewan;
    }

    public void makan() {
        System.out.println(namaHewan + " sedang makan");
    }
}
