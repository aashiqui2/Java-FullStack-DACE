public class Student implements Comparable<Student>{
    String name;
    int regNo;

    public Student(String name,int regNo)
    {
        this.name=name;
        this.regNo=regNo;
    }

    //toString()
    @Override
    public String toString() {
        return this.name +" "+ this.regNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.regNo-o.regNo;
    }

}
