package dataStructure.collection;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<String>();

        set.add("Rizki");
        set.add("Putri");
        set.add("Rizki");

        System.out.println("Jumlah elemen dalam HashSet: " + set.size());

        System.out.println("Apakah Rizki ada di dalam HashSet? " + set.contains("Rizki"));
        System.out.println("Apakah Putri ada di dalam HashSet? " + set.contains("Putri"));
        System.out.println("Apakah Andi ada di dalam HashSet? " + set.contains("Andi"));

        for (String element : set) {
            System.out.println(element);
        }
    }
}
