class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char c1=s.charAt(i);
            char c2=s.charAt(i+1);
            int val1=(int)c1;
            int val2=(int)c2;
            int diff=Math.abs(val1-val2);
            sum+=diff;
        }
        return sum;
    }
}