import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // forEach
        for (Integer val : list) {
            System.out.println(val);
        }
        // iterator() ->hasNext(),next()
        Iterator<Integer> cursor = list.iterator();
        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        //ListIterator ->hasNext(),hasPrevious(),next(),previous()
        ListIterator<Integer> cursor1=list.listIterator();
        while (cursor1.hasNext()) {
            System.out.println(cursor1.next());
        }
        while (cursor1.hasPrevious()) {
            System.out.println(cursor1.previous());
        }

    }
}
