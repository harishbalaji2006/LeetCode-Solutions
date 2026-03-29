class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] str=new char[4];
        char[] a=new char[4];
        char[] b=new char[4];
        str[0]=s1.charAt(2);
        str[1]=s1.charAt(3);
        str[2]=s1.charAt(0);
        str[3]=s1.charAt(1);
        a[0]=s1.charAt(0);
        a[1]=s1.charAt(3);
        a[2]=s1.charAt(2);
        a[3]=s1.charAt(1);
        b[0]=s1.charAt(2);
        b[1]=s1.charAt(1);
        b[2]=s1.charAt(0);
        b[3]=s1.charAt(3);
        String str1=new String(str);
        String str2=new String(a);
        String str3=new String(b);
        if(str1.equals(s2) || str2.equals(s2) || str3.equals(s2) || s1.equals(s2)) return true;
        return false;
    }
}