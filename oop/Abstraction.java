package oop;

public abstract class Abstraction {
    String namaBentuk;

    public abstract double hitungLuas();

    public void tampilkanNamaBentuk() {
        System.out.println("Nama bentuk: " + namaBentuk);
    }
}
