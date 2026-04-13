class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        if(nums.length==1) return 0;
        int minval=99999;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                minval=Math.min(minval,Math.abs(i-start));
            }
        }
        return minval;
    }
}