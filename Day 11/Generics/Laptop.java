import java.util.Objects;

public class Laptop {
    int id;
    String name;

    Laptop(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "["+this.id+", "+this.name+"]";
    }
}
