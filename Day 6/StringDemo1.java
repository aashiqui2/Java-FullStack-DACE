public class StringDemo1 {
    public static void main(String[] args) {
        //indexOf()
        String s="My world My Life";
        System.out.println(s.indexOf("w"));
        //indexOf(str,FromIndex)
        System.out.println(s.indexOf("M",5));

        //lastIndex()
        System.out.println(s.lastIndexOf("y"));

        //substring(st index,endindex-1)
        String str="my World";
        System.out.println(str.substring(0));
        System.out.println(str.substring(0,0));
        System.out.println(str.substring(0,5));
        // no negative index
        // System.out.println(str.substring(0,-1));

        //chartAt()
        String st="my programming world";
        System.out.println(st.charAt(7));//no negative index

        //subsequence()
        String st1="my programming world";
        System.out.println(st1.subSequence(0, 4));

    }
}
