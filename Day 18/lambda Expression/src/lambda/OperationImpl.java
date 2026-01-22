package lambda;

public class OperationImpl /*implements Operation*/ {
   /* @Override
    public int increment(int num) {
        return ++num;
    }*/

    public static void main(String[] args) {
        //OperationImpl operationImpl = new OperationImpl();

        // dynamic binding
        //Operation operation=new OperationImpl();
        /*Operation operation = new Operation(){
            @Override
            public int increment(int num) {
                return ++num;
            }
        };*/

        Operation operation =num ->  ++num;
        int result = operation.increment(1);
        System.out.println(result);
    }
}
