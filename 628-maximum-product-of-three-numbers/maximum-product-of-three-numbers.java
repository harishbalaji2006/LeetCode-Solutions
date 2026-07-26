class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len=nums.length;
        int p1=nums[len-1]*nums[len-2]*nums[len-3];
        int p2=nums[0]*nums[1]*nums[len-1];
        return Math.max(p1,p2);
    }
}