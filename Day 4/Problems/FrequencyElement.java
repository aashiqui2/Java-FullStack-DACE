import java.util.Arrays;

public class FrequencyElement {
    public static void main(String[] args) {
        int a[] = { 1, 2, 5, 3, 3, 6, 2, 5, 5, 7, 7 };
        /*boolean[] isVisited=new boolean[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(isVisited[i]==true)
            {
                continue;
            }
            int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    isVisited[j]=true;
                }
            }
            if(count>0)
            {
                System.out.println(a[i]+" "+count);
            }
        }*/

        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max){
                max=a[i];
            }
        }
        int dp[]= new int[max+1];
        for(int i=0;i<a.length;i++)
        {
            dp[a[i]]++;
        }
        for(int i=0;i<dp.length;i++)
        {
            if(dp[i]>0){
                System.out.println(i+" "+dp[i]);
            }
        }
    }
}
