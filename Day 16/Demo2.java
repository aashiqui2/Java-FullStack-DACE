import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        List<String> studentNames = new ArrayList<>();
        studentNames.add("abc");
        studentNames.add("raja");
        studentNames.add("gopal");
        studentNames.add("rahul");
        if (studentNames.contains("rahul")) {
            System.out.println("Found");
        } else { 
            System.out.println("Not Found");
        }

    }
}
