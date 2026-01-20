import java.util.*;
public class Demo4 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(
            Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9,10})
        );

        List<Integer> evenList= new ArrayList<>();
        List<Integer> oddList= new ArrayList<>();
        
        //forEach()
        for(Integer val:list){
            if(val%2==0)
            {
                evenList.add(val);
            }
            else{
                oddList.add(val);
            }
        }
        System.out.println(list);
        System.out.println(evenList);
        System.out.println(oddList);
    }
}
