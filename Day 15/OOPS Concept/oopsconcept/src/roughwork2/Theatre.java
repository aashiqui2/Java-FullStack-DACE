package roughwork2;

public class Theatre {
    public static void main(String[] args) {
        Theatre raja = new Theatre();
        int balance = raja.bookTicket(200);
        System.out.println("After booking ticket " + balance);
    }

    int bookTicket(int price) {
        int ticket_price = 120;
        return price - ticket_price;
    }
}
