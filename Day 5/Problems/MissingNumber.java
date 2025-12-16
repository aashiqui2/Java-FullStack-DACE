public class MissingNumber {
    public static void main(String[] args) {
        int N=6;
        int a[]={1,2,3,5,6};
        /* int sum=N*(N+1)/2;
        int sum1=0;
        for(int i=0;i<a.length;i++)
        {
            sum1+=a[i];
        }
        System.out.println(sum-sum1); */

      int xor1=0,xor2=0;
      for(int i=0;i<N-1;i++)
      {
            xor1=xor1^(i+1);
            xor2=xor2^a[i];
      }
      xor1=xor1^N;
      System.out.println(xor1^xor2);
    }
}
