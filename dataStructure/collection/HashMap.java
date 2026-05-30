package dataStructure.collection;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new java.util.HashMap<String, Integer>();

        map.put("Rizki", 29);
        map.put("Putri", 17);
        map.put("Rizki", 19);

        int umurRizki = map.get("Rizki");
        int umurPutri = map.get("Putri");

        System.out.println("Umur Rizki: " + umurRizki);
        System.out.println("Umur Putri: " + umurPutri);

        System.out.println("Apakah Rizki ada di dalam map? " + map.containsKey("Rizki"));
        System.out.println("Apakah Putri ada di dalam map? " + map.containsKey("Putri"));
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

    }
}
