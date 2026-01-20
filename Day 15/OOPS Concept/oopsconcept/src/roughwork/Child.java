package roughwork;

public class Child extends Parent {

    Child() {
        //super()
        System.out.println("In child constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.watching_Tv();
        child.work();

        int result=child.add(2,3);
        System.out.println(result);

        result=child.add(2,3,4);
        System.out.println(result);
    }

    //method overriding (runtime polymorphism)
    // 1. it should be same signature as parent
    // 2. do not reduce the visibility
    @Override
    public void work()
    {
        System.out.println("In work in office");
    }


    //method overloading (compile-time  polymorphism)
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b;
    }
    float add(float a,float b)
    {
        return a+b;
    }

}
