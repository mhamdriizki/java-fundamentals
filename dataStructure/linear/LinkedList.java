package dataStructure.linear;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<String> namaBuah = new java.util.LinkedList<String>();

        namaBuah.add("Apel");
        namaBuah.add("Jeruk");
        namaBuah.add("Mangga");

        namaBuah.add(2, "Semangka");
        int totalBuah = namaBuah.size();

        for (int i = 0; i < totalBuah; i++) {
            System.out.println(namaBuah.get(i));
        }

        int indexJeruk = namaBuah.indexOf("Jeruk");
        String lastIndex = namaBuah.getLast();

        System.out.println("Index Jeruk: " + indexJeruk);
        System.out.println("Index terakhir: " + lastIndex);
    }
}
