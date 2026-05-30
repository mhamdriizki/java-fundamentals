package dataStructure.linear;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> namaBuah = new java.util.ArrayList<String>();

        namaBuah.add("Apel");
        namaBuah.add("Jeruk");
        namaBuah.add("Mangga");

        namaBuah.add(2, "Semangka");

        int totalBuah = namaBuah.size();

        for (int i = 0; i < totalBuah; i++) {
            System.out.println(namaBuah.get(i));
        }
    }
}
