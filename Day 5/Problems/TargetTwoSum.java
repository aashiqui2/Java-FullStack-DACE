import java.util.Arrays;

public class TargetTwoSum {
    public static void main(String[] args) {
        int a[] = { 2, 7, 11, 13 };
        int k = 9;
        int res[] =TargetTwoSum(a, k);
        System.out.println(Arrays.toString(res));
    }

    public static int[] TargetTwoSum(int[] a, int target) {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]+a[j]==target){
                    return new int[]{i,j} ;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
