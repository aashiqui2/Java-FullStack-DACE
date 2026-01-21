import java.util.*;
public class Demo2 {
    int[] twoSum(int[] a,int n,int k)
    {
        // write logic
        Map<Integer,Integer> map= new HashMap<>();
        int result[]=new int[2];
        for(int i=0;i<n;i++)
        {
            //b=c-a;
            int b=k-a[i];
            if(map.containsKey(b)){
                result[0]=map.get(b);
                result[1]=i;
                return result;
            }
            map.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int a[]={-8,1,4,6,10,45};
        int k=16;
        Demo2 d= new Demo2();
        int result[]=d.twoSum(a, a.length,k);
        System.out.println(Arrays.toString(result));
    }
 
}
