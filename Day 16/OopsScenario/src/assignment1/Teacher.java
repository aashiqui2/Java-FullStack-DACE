package assignment1;

public class Teacher {

    public static void main(String[] args) {
        School teacher = new School();
        teacher.conduct_exams();
        teacher.publish_results(75);

        System.out.println(School.school_name);//static can be accessed by class name

        //System.out.println(teacher.salary);//salary has private access in assignment1.School
    }
}
