package conditionalLogic;

public class StrukturKontrolIfElse {
    public static void main(String[] args) {
        System.out.println("Struktur Kontrol If Else");
        int nilaiUjian = 75;

        if (nilaiUjian >= 90) {
            System.out.println("Nilai Anda " + nilaiUjian + ", predikat A");
        } else if (nilaiUjian >= 80) {
            System.out.println("Nilai Anda " + nilaiUjian + ", predikat B");
        } else if (nilaiUjian >= 70) {
            System.out.println("Nilai Anda " + nilaiUjian + ", predikat C");
        } else if (nilaiUjian >= 60) {
            System.out.println("Nilai Anda " + nilaiUjian + ", predikat D");
        } else {
            System.out.println("Nilai Anda " + nilaiUjian + ", predikat E");
        }

    }
}
