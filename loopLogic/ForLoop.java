package loopLogic;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("The value of i is: " + i);
        }

        int[] angka = {1, 2, 3, 4, 5};
        int jumlah = 0;
        for (int i = 0; i < angka.length; i++) {
            jumlah += angka[i];
        }
        System.out.println("The sum of the array elements is: " + jumlah);
    }
}
