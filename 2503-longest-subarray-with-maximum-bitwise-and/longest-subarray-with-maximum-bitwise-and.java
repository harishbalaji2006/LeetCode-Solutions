class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int c = 0;
        for(int num : nums) {
            max = Math.max(max,num);
        }
        int maxc = 0;
        for(int num : nums) {
            if(num == max) {
                c++;
                maxc = Math.max(maxc,c);
            } else c = 0;
        }
        return maxc;
    }
}