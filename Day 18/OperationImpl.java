public class OperationImpl {

    // @Override
    // public void add(int a,int b)
    // {
    // System.out.println(a+b);
    // }
    // @Override
    // public void sub(int a,int b){
    // System.out.println(a-b);
    // }

    // @Override
    // public int increment(int num)
    // {
    // return ++num;
    // }

    public static void main(String[] args) {
        // Operation operation = new Operation() {
        // @Override
        // public int increment(int num) {
        // return ++num;
        // }
        // };
        Operation operation = num ->  ++num;
        int result = operation.increment(2);
        System.out.println(result);
    }
}
