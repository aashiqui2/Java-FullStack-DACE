import java.util.*;

public class Demo1 {
    public static void main(String[] args) {
        // Map<Integer,String> map= new TreeMap<>();
        // map.put(1,"Ashok");
        // map.put(4,"Bala");
        // map.put(2,"Kumar");
        // System.out.println(map);

        Student student1 = new Student();
        student1.setName("rahul");
        student1.setRegNo(21);

        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(10, "Rajesh");

        // ! Comparable
        // Map<Student,String> map= new TreeMap<>();
        // map.put(student1,"Sports Captain");
        // map.put(student2, "Rep");
        // map.put(student3, "Pupil leader");

        // System.out.println(map);

        // ! Comparator
        Map<Student, String> map = new TreeMap<>(
            new Comparator<Student>() {
                public int compare(Student o1, Student o2) {
                   //return o1.getName().length()-o2.getName().length();
                   return o1.getName().compareTo(o2.getName());
                };
            }
        );
        map.put(student1, "Sports Captain");
        map.put(student2, "Rep");
        map.put(student3, "Pupil leader");

        System.out.println(map);
    }
}
