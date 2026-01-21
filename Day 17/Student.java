public class Student implements Comparable<Student>{
    private int regNo;
    private String name;
    Student()
    {
        System.out.println(" i am Student ");
    }
    Student(int regNo,String name){
        this.regNo=regNo;
        this.name=name;
    }

    //Getters
    public int getRegNo() {
        return regNo;
    }
    public String getName() {
        return name;
    }

    //Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    @Override
    public int compareTo(Student o) {
        return this.regNo -o.regNo;
    }

    @Override
    public String toString() {
        return this.regNo+" "+this.name;
    }

    
}
