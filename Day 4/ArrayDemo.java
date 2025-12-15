import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        /*int n=5;
        int a1[]=new int[n];

        int arr[]={1,2,3};
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int val:arr)
        {
            System.out.println(val);
        }
        System.out.println(Arrays.toString(arr));
        */
        int[][] a1={
                   {1,2},
                   {4,5},
                   {7,8}
                 };
        int rowLen=a1.length;
        int colLen=a1[0].length;


        int row=3,col=2;
        int [][]a =new int[row][col];

        Scanner sc= new Scanner(System.in);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
