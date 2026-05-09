class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=9999;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                for(int j=0;j<nums.length;j++){
                    if(nums[j]==2){
                        min=Math.min(min,Math.abs(j-i));
                    }
                }
            }
        }
        if(min!=9999){
            return min;
        }
        return -1;
    }
}