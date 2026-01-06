import java.util.Objects;
public class BookRecord {
    private Book[] items;

    BookRecord() {
        this.items = new Book[10];
    }

    void addBook(Book book) {
        for (int i = 0; i < items.length;i++) {
            if (Objects.isNull(items[i])) {
                items[i] = book;
                break;
            }
        }
    }

    Book getBook(int index) {
        if(index<items.length){
            return items[index];
        }else{
            return null;
        }
    }
}
