import java.util.Objects;
public class Laptop {
    int id;
    String name;

    Laptop(int id, String name) {
        this.id = id;
        this.name = name;
    }
    Laptop(int id)
    {
        this.id=id;
    }
    @Override
    public String toString() {
        return "["+this.id+", "+this.name+"]";
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
           Laptop other=(Laptop)obj;
           return id==other.id;
        }
}
