class Solution {
    public boolean isBalanced(String num) {
        int s1=0,s2=0;
        for(int i=0;i<num.length();i++){
            if(i%2==0){
                int n=num.charAt(i)-'0';
                s1+=n;
            }
            else{
                int n=num.charAt(i)-'0';
                s2+=n;
            }
        }
        if(s1==s2) return true;
        return false;
    }
}