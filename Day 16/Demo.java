import java.util.*;
public class Demo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        List<Integer> list2=new ArrayList<>();
        list2.add(6);
        list2.add(7);

        list.addAll(list2);
        System.out.println(list);

        List<String> list3=new ArrayList<>();
        list3.add("java");
        list3.add("c");
        list3.add("python");

        List<String> list4=Arrays.asList("javascript","react");
        list4.set(1,"angular");//fine
        //list4.remove(1); //error
        //list4.add("c++"); //error


        list3.addAll(list4);
        System.out.println(list3);

        String str[]={"raja","ramu","gopal"};
        List<String> list5=Arrays.asList(str);
        System.out.println(Arrays.toString(str));
        System.out.println(list5);

        list5.set(1,"charan");
        System.out.println(Arrays.toString(str));
        System.out.println(list5);


        //List.of()

        List<String> list6=List.of("Raja","Ramu");
        //list6.add("rahul"); error
        //list6.set(1,"java");//error

        String str1[]={"java","c++"};
        List<String> list7=List.of(str1);
        System.out.println(list6);
        System.out.println(list7);




    }

}
