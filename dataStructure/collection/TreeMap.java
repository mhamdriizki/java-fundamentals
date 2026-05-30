package dataStructure.collection;

public class TreeMap {
    public static void main(String[] args) {
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<String, Integer>();

        treeMap.put("Rizki", 29);
        treeMap.put("Putri", 17);
        treeMap.put("Andi", 25);

        int umurRizki = treeMap.get("Rizki");
        int umurPutri = treeMap.get("Putri");
        int umurAndi = treeMap.get("Andi");

        System.out.println("Umur Rizki: " + umurRizki);
        System.out.println("Umur Putri: " + umurPutri);
        System.out.println("Umur Andi: " + umurAndi);

        System.out.println("Apakah Rizki ada di dalam TreeMap? " + treeMap.containsKey("Rizki"));
        System.out.println("Apakah Putri ada di dalam TreeMap? " + treeMap.containsKey("Putri"));
        System.out.println("Apakah Andi ada di dalam TreeMap? " + treeMap.containsKey("Andi"));

        for (String key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }
    }
}
