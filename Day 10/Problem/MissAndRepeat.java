import java.util.HashMap;
import java.util.Map;

public class MissAndRepeat {

    public static void main(String[] args) {
        int N=6;
        int a[]={1,2,3,1,5,6};
        findMissAndRepeat(a,N);
    }
    public static void findMissAndRepeat(int a[],int n)
    {
        //int repeated=-1,missing=-1;
        // int temp[]= new int[n+1];
        // for(int i=0;i<n;i++)
        // {
        //     temp[a[i]]++;
        // }

        // for(int i=1;i<=n;i++)
        // {
        //     if(temp[i]==0)
        //     {
        //         missing=i;
        //     }
        //     if(temp[i]==2){
        //         repeated=i;
        //     }
        // }
        //System.out.println("Missing Number "+missing+ " Repeated "+repeated);

        int repeated=-1,missing=-1;
        Map<Integer,Integer> m=new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            m.put(a[i],m.getOrDefault(a[i], 0)+1);
        }

        for(int i=1;i<=n;i++)
        {
            if(m.containsKey(i)){
                if(m.get(i)==2){
                    repeated=i;
                }
            }
            else{
                missing=i;
            }
        }
        System.out.println("Missing Number "+missing+ " Repeated "+repeated);
    }
}