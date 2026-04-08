class Solution {
    public char findTheDifference(String s, String t) {
        int s1=0,s2=0;
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i);
            s1+=a;
        }
        for(int i=0;i<t.length();i++){
            int b=t.charAt(i);
            s2+=b;
        }
        int diff=s2-s1;
        return (char)diff;
    }
}