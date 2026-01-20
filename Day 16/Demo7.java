import java.util.*;

public class Demo7 {
    public static void main(String[] args) {
        // Student raja= new Student();
        // raja.name="raja";
        // raja.regNo=21;

        Student student1= new Student("Ramu", 21);
        Student student2= new Student("Rahul", 20);
        Student student3= new Student("Mukul", 19);
        Student student4= new Student("Sharma", 24);
        Student student5= new Student("Rohit", 29);


        List<Student> list= new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list,new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
                //return o1.name.length()-o2.name.length();
            };
            
        }
    );
    System.out.println(list);
    }
}
