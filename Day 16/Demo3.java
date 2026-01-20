import java.util.*;
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Integer a[]=new Integer[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        List<Integer> list=new ArrayList<>(Arrays.asList(a));
        int sum=0;
        for(int i=0;i<list.size();i++)
        {
            sum=sum+list.get(i);
        }
        System.out.println("The sum is "+sum);
        //find maximum

        int max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>max){
                max=list.get(i);
            }
        }
        System.out.println("The max "+max);

    }
}
