class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String s1=str1+str2;
        String s2=str2+str1;
        if(!s1.equals(s2)) return "";
        int res=gcd(str1.length(),str2.length());
        return str1.substring(0,res);
    }
    public int gcd(int a,int b){
        while(b!=0){
            int t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}