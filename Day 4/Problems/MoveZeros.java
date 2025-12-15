import java.util.Arrays;
import java.util.Scanner;
public class MoveZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int idx=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
