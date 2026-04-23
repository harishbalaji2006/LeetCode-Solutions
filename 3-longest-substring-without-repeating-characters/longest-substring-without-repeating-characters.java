class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            boolean[] flag=new boolean[128];
            for(int j=i;j<s.length();j++){
                if(flag[s.charAt(j)]==true){
                    break;
                }
                else{
                    res=Math.max(res,j-i+1);
                    flag[s.charAt(j)]=true;
                }
            }
        }
        return res;
    }
}