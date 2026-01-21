import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // raw type
        /*
         * Map map= new HashMap<>();
         * map.put(1,"rahul");
         * map.put("Leader","santhosh");
         * map.put(null,'a');
         * map.put(3.17,"PI Value");
         */

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "rahul");
        map.put(2, "alex");
        map.put(3, "antony");
        System.out.println(map.get(2));
        System.out.println(map.get(5));
        System.out.println(map.getOrDefault(5, "Unknown name"));

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(4, "santhosh");
        map1.put(5, "naveen");
        map.putAll(map1);
        System.out.println(map);

        // Arrays.asList(),List.of(),Set.of(),Map.Of()

        Map<Integer, String> map2 = Map.of(1, "rahul", 2, "Kumar");
        // map2.remove(2);Error
        System.out.println(map2);

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(map.get(key));
        }

       Set<Map.Entry<Integer,String>> entries= map.entrySet();
       for(Map.Entry<Integer,String> entry:entries)
       {
          System.out.println(entry.getKey()+" "+entry.getValue());
       }

    }
}
