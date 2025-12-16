import java.util.Arrays;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        int a[]={0, 2, 1, 2, 0, 1};
        /*int c0=0,c1=0,c2=0;
         for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            {
                c0++;
            }else if(a[i]==1)
            {
                c1++;
            }
            else{
                c2++;
            }
        }
        for(int i=0;i<c0;i++)
        {
            a[i]=0;
        }
        for(int i=c0;i<c0+c1;i++)
        {
            a[i]=1;
        }
        for(int i=c0+c1;i<a.length;i++)
        {
            a[i]=2;
        } */

        int low=0,mid=0,high=a.length-1;
        while(mid<=high)
        {
            if(a[mid]==0)
            {
                //swap mid with low
                int temp=a[low];
                a[low]=a[mid];
                a[mid]=temp;
                low++;
                mid++;
            }
            else if(a[mid]==1){ //just move the mid pointer
                mid++;
            }else{
                //swap mid with high
                int temp=a[high];
                a[high]=a[mid];
                a[mid]=temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
