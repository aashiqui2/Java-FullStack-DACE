package streams;

import java.util.Objects;

public class Student {

    private int regNo;
    private String name;
    private int mark;

    public Student(int regNo,String name,int mark){
        this.regNo=regNo;
        this.name=name;
        this.mark=mark;
    }
    public int getRegNo() {
        return regNo;
    }
    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "regNo=" + regNo +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return regNo == student.regNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(regNo);
    }
}
