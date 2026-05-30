package dataStructure.collection;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<String> treeSet = new java.util.TreeSet<String>();

        treeSet.add("Rizki");
        treeSet.add("Putri");
        treeSet.add("Andi");
        treeSet.add("Putri");

        System.out.println("Jumlah elemen dalam TreeSet: " + treeSet.size());

        System.out.println("Apakah Rizki ada di dalam TreeSet? " + treeSet.contains("Rizki"));
        System.out.println("Apakah Putri ada di dalam TreeSet? " + treeSet.contains("Putri"));
        System.out.println("Apakah Andi ada di dalam TreeSet? " + treeSet.contains("Andi"));

        for (String element : treeSet) {
            System.out.println(element);
        }
    }
}
