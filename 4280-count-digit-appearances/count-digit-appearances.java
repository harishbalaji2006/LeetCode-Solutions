class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        String str="";
        for(int i=0;i<nums.length;i++){
            String s=Integer.toString(nums[i]);
            str+=s;
        }
        char ch=(char)(digit+'0');
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                c++;
            }
        }
        return c;
    }
}