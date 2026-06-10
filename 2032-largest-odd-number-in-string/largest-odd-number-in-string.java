class Solution {
    public String largestOddNumber(String num) {
        int idx=-1;
        for(int i=0;i<num.length();i++){
            int n = num.charAt(i)-'0';
            if(n%2!=0){
                idx=i;
            }
        }
        return num.substring(0,idx+1);
    }
}