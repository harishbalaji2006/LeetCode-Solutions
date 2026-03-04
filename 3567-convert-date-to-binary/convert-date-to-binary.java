class Solution {
    public String convertDateToBinary(String date) {
        String res="";
        String str1=date.substring(0,4);
        String str2=date.substring(5,7);
        String str3=date.substring(8,10);
        Integer n1=Integer.parseInt(str1);
        Integer n2=Integer.parseInt(str2);
        Integer n3=Integer.parseInt(str3);
        res+=Integer.toBinaryString(n1);
        res+="-";
        res+=Integer.toBinaryString(n2);
        res+="-";
        res+=Integer.toBinaryString(n3);
        return res;
    }
}