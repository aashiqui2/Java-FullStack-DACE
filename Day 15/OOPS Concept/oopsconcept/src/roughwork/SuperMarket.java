package roughwork;

public class SuperMarket {
    String prodName;
    int price;
    int discount;

    //Constructor
    //1. it should be same name as classname
    //2. it should not contain return type
    //3. it can contain access modifier
    //4. when we create an object constructor is called automatically
    //5. it is useful for initialization object specific value.

    //String ->null
    //int -> 0
    //float-> 0.0
    //char->''
    //boolean-> false
    //long -> 0
    //double ->0.0

    public SuperMarket()
    {
        System.out.println("SuperMarket constructor");
    }

    public SuperMarket(String prodName, int price, int discount){
        this.prodName = prodName;
        this.price = price;
        this.discount = discount;
    }

    public static void main(String[] args) {
        SuperMarket product1 = new SuperMarket();
        // this.prodName = prodName;
        product1.prodName="rice";
        product1.price=10;
        product1.discount=2;

        SuperMarket product2 = new SuperMarket();
        product2.prodName="ice cream";
        product2.price=16;
        product2.discount=12;

        SuperMarket product3 = new SuperMarket("biscuits",10,5);

        SuperMarket product4 = new SuperMarket();
        System.out.println(product1.prodName);
        System.out.println(product2.prodName);
        System.out.println(product3.prodName);
        System.out.println(product4.prodName);
    }
}
