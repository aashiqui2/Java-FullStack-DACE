import java.util.Objects;
public class Book {
    int id;
    String name;

    Book(int id,String name){
        this.id=id;
        this.name=name;
    }

    Book(int id){
        this.id=id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
       if(this==obj)
       {
        return true;
       }
       if(obj==null){
        return false;
       }
       if(getClass()!=obj.getClass()){
        return false;
       }
       Book other=(Book)obj;
       return id==other.id;
    }
    
    @Override
    public String toString() {
        return "["+this.id+", "+this.name+"]";
    }
}
