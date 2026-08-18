class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res = new int[2 * nums.length];
        int j = 0;
        for(int i = 0; i < nums.length ; i++) {
            res[i] = nums[i];
        }
        for(int i = res.length - 1; i >= nums.length; i--) {
            res[i] = nums[j];
            j++;
        }
        return res;
    }
}