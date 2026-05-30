package oop;

public class PersegiAsAbstraction extends Abstraction {
    private double sisi;

    public PersegiAsAbstraction(double sisi) {
        this.sisi = sisi;
        super.namaBentuk = "Persegi";
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    
}
