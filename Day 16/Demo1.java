import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        List<Integer> list1= new ArrayList<>();
        list1.add(1);
        list1.add(5);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        Collections.reverse(list1);
        System.out.println(list1);

        int a[]={2,1,4,5,3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Integer a1[]={2,1,4,5,3};
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));

    }
}
