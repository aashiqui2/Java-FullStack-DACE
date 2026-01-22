import java.util.*;

public class Demo5 {
    public static void main(String[] args) {
        // List<Integer> list= new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // list.add(6);

        // list.forEach();

        // Demo5 d= new Demo5();
        // d.dontSleep("We dont sleep");

        Rule r= new Rule(){
            @Override
            public void dontSleep(String accept)
            {
                System.out.println(accept);
            }
        };


    }
    /* 
    @Override
    public void dontSleep(String accept) {
        System.out.println(accept);
    }
    */
}
