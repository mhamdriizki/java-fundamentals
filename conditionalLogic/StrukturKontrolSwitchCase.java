package conditionalLogic;

public class StrukturKontrolSwitchCase {
    public static void main(String[] args) {
        int namaHari = 3;

        switch (namaHari) {
            case 1:
                System.out.println("Hari ke-" + namaHari + " adalah Senin");
                break;
            case 2:
                System.out.println("Hari ke-" + namaHari + " adalah Selasa");
                break;
            case 3:
                System.out.println("Hari ke-" + namaHari + " adalah Rabu");
                break;
            case 4:
                System.out.println("Hari ke-" + namaHari + " adalah Kamis");
                break;
            case 5:
                System.out.println("Hari ke-" + namaHari + " adalah Jumat");
                break;
            case 6:
                System.out.println("Hari ke-" + namaHari + " adalah Sabtu");
                break;
            case 7:
                System.out.println("Hari ke-" + namaHari + " adalah Minggu");
                break;
            default:
                System.out.println("Inputan hari tidak valid");
        }
    }
}
