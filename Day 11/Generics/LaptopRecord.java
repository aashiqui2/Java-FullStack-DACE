import java.util.Objects;

public class LaptopRecord {
    private Laptop[] items;

    LaptopRecord() {
        this.items = new Laptop[10];
    }

    void addLaptop(Laptop laptop) {
        for (int i = 0; i < items.length;i++) {
            if (Objects.isNull(items[i])) {
                items[i] = laptop;
                break;
            }
        }
    }

    Laptop getLaptop(int index) {
        if(index<items.length){
            return items[index];
        }else{
            return null;
        }
    }
}
