public class Main {
    public static void main(String[] args) {
        Book bookRepositoty[] = {
                new Book(1, "Java Programming"),
                new Book(2, "Java Advance"),
                new Book(3, "Spring Boot")
        };

        Book result = findBook(bookRepositoty, new Book(4));
        System.out.println(result);
        Laptop laptopRepository[] = {
                new Laptop(1, "ASUS"),
                new Laptop(2, "Lenova"),
                new Laptop(3, "Hp")
        };

        Laptop result1= findLaptop(laptopRepository, new Laptop(2));
        System.out.println(result1);

        Laptop result2= (Laptop)find(laptopRepository, new Laptop(2));
        System.out.println(result2);
        Book result3= (Book)find(bookRepositoty, new Book(3));
        System.out.println(result3);

    }

    static Book findBook(Book[] Repository, Book itemToFind) {
        for (Book item : Repository) {
            if (item.equals(itemToFind)) {
                return item;
            }
        }
        return null;
    }

    static Laptop findLaptop(Laptop[] Repository, Laptop itemToFind) {
        for (Laptop item : Repository) {
            if (item.equals(itemToFind)) {
                return item;
            }
        }
        return null;
    }

    static <E> Object find(E[] Repository, E itemToFind){
        for (E item : Repository) {
            if (item.equals(itemToFind)) {
                return item;
            }
        }
        return null;
    }
}
