import java.util.*;
public class Demo8 {
    public static void main(String[] args) {
      Set<Integer> s=new HashSet<>();
      s.add(3);
      s.add(1);
      s.add(2);
      s.add(3);
      System.out.println(s); 

      List<Integer> list= new ArrayList<>();
      list.add(4);
      list.add(4);
      list.add(5);

      s.addAll(list);
      System.out.println(s);

      List<Integer> list1= new ArrayList<>(s);
      Collections.reverse(list1);
      System.out.println(list1);


    }
}
