import java.util.Objects;

public class Record<A> {
    private A[] items;

    Record() {
        items = (A[]) new Object[10];
    }

    public void addItem(A item) {
        for (int i = 0; i < items.length; i++) {
            if (Objects.isNull(items[i])) {
                items[i] = item;
                break;
            }
        }

    }
    public A getItem(int index) {
        if (index < items.length) {
            return items[index];
        } else {
            return null;
        }
    }
}