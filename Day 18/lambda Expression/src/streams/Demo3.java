package streams;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo3 {

    static List<Student> generateEmployee()
    {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(2,"Rohit",60));
        studentList.add(new Student(1,"Santhosh",89));
        studentList.add(new Student(3,"Abhishek",70));
        studentList.add(new Student(5,"Mal",30));
        studentList.add(new Student(5,"Mal",50));
        studentList.add(new Student(4,"Krish",40));
        return studentList;
    }

    public static void main(String[] args) {
        List<Student> studentList=generateEmployee();
        System.out.println("Count");
        long count=studentList.stream().count();
        System.out.println(count);
        System.out.println("skip");
        studentList.stream()
                   .skip(3)
                   .forEach(System.out::println);
        System.out.println("Limit");
        studentList.stream()
                   .limit(2)
                   .forEach(System.out::println);

        System.out.println("Distinct");
        studentList.stream()
                   .distinct()
                   .forEach(System.out::println);

        System.out.println("dropWhile");
        studentList.stream()
                    .dropWhile(student->student.getMark()>=60)
                    .forEach(System.out::println);

        System.out.println("takeWhile");
        studentList.stream()
                .takeWhile(student->student.getMark()>=60)
                .forEach(System.out::println);

        System.out.println("Map");
        studentList.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("FlatMap");
       Stream<List<Student>> studentFlatList=Stream.of(studentList);
       studentFlatList
               .flatMap(Collection::stream)
               .forEach(System.out::println);

       //ANY MATCH,NONE MATCH,ALL MATCH,FIND FIRST,FIND ANY



    }

}
