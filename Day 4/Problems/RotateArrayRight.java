import java.util.Arrays;
import java.util.Scanner;
public class RotateArrayRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (k % size != 0) {
            for (int j = 0; j < k; j++) {
                //write your logic
                int last=a[size-1];
                for(int i=size-1;i>0;i--)
                {
                    a[i]=a[i-1];
                }
                a[0]=last;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
