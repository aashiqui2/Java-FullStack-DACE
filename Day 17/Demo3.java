import java.util.*;

public class Demo3 {
  
    void printFrequency(int[] a, int n) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int count = map.getOrDefault(a[i], 0) + 1;
            map.put(a[i], count);
        }
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int a[] = { 2, 2, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 6 };
        Demo3 d = new Demo3();
        d.printFrequency(a,a.length);
    }
}
