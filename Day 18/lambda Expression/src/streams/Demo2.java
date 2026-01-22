package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo2 {
    public static void main(String[] args) {
        int a[]={30,20,60,50,40};
        //IntStream ->Stream<Integer> using boxed()
        Stream<Integer> data= Arrays.stream(a).boxed()
                .filter(val->val>30)
                .sorted();
        data.forEach(System.out::println);

    }
}
