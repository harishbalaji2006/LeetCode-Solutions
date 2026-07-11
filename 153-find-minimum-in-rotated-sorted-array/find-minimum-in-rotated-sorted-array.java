class Solution {
    public int findMin(int[] nums) {
        int min = 99999;
        for(int num : nums){
            min = Math.min(min,num);
        }
        return min;
    }
}