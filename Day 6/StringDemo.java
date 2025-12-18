public class StringDemo {
    public static void main(String[] args) {
        String str = new String("Raju");
        System.out.println(str);

        // length()
        System.out.println(str.length());

        // isBlank()
        // it return true if it has whitespaces and aslo the length as zero,otherwise
        // false.
        String s1 = "";
        System.out.println(s1.isBlank());

        // isEmpty()
        // it return true when the length is zero otherwise false.
        String s2 = "";
        System.out.println(s2.isEmpty());

        // equals()
        String ss1 = "abc";
        String ss2 = "abcd";
        System.out.println(ss1.equals(ss2));

        // equalsIgnorecase()
        String st1 = "abc";
        String st2 = "Abc";
        System.out.println(ss1.equalsIgnoreCase(ss2));

        //compareTo()
        //it return zero if al the character are same,else return negative if s1<s2,else return positive s1>s2.
        String str1="Abc";
        String str2="abc";
        System.out.println(str1.compareTo(str2));

        //compareToIgnoreCase()
        String sstr1="Abc";
        String sstr2="abc";
        System.out.println(sstr1.compareToIgnoreCase(sstr2));

        //startswith()
        String a="Hello World";
        System.out.println(a.startsWith("ello"));
        //startsWith(prefix,fromIndex)
        System.out.println(a.startsWith("W",6));

        //endsWith()
        String b="Programming";
        System.out.println(b.endsWith("ing"));

        //contentEquals()
        String c="Hello";
        System.out.println(c.contentEquals("Hello"));

        //contains()
        String d="My first Java Program";
        System.out.println(d.contains("Java"));
    }
}
