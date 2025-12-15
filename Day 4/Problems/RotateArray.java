import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
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
                int first = a[0];
                for (int i = 0; i < size - 1; i++) {
                    a[i] = a[i + 1];
                }
                a[size - 1] = first;
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
