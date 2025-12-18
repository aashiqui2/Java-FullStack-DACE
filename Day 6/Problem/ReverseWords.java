public class ReverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        /* StringBuilder sb = new StringBuilder();
        s=s.trim();
        String[] str = s.split("\\s+");
        for(int i=str.length-1;i>=0;i--)
        {
            sb.append(str[i]);
            if(i!=0)
            {
                sb.append(" ");
            }
        }
        return sb.toString(); */

        StringBuilder sb = new StringBuilder();
        int end=s.length()-1;
        while(end>=0)
        {
            while(end>=0 && s.charAt(end)==' '){
                end--;
            }
            int start=end;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            sb.append(s.substring(start+1,end+1)).append(" ");
            end=start-1;
        }
        return sb.toString().trim();
    }
}
