public class GetSingleElement {
    public static void main(String[] args) {
        int a[]={1,1,4,4,2,3,3,5,5};
        int unique=0;
        for(int i=0;i<a.length;i++)
        {
            unique=unique^a[i];
        }
        System.out.println(unique);
    }
}
