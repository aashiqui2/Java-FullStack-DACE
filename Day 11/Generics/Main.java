public class Main {

    public static void main(String[] args) {
        Book book1= new Book(1, "Java Programming");
        Book book2= new Book(2, "Java Advance");

        Laptop laptop1= new Laptop(3, "Lenova");
        Laptop laptop2= new Laptop(4, "Hp");

        BookRecord bookRecord= new BookRecord();
        bookRecord.addBook(book1);
        bookRecord.addBook(book2);
        System.out.println(bookRecord.getBook(0));
        System.out.println(bookRecord.getBook(1));

        LaptopRecord laptopRecord= new LaptopRecord();
        laptopRecord.addLaptop(laptop1);
        laptopRecord.addLaptop(laptop2);
        System.out.println(laptopRecord.getLaptop(0));
        System.out.println(laptopRecord.getLaptop(1));

        Record record= new Record<>();
        record.addItem(book1);
        record.addItem(laptop1);
        System.out.println(record.getItem(0));
        System.out.println(record.getItem(1));


    }
}