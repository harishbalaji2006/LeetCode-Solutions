class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] res = new int[nums.length];
        int[] pref = new int[nums.length];
        int[] suff = new int[nums.length];
        pref[0] = nums[0];
        suff[nums.length - 1] = nums[nums.length - 1];
        for(int i = 1; i < nums.length; i++) {
            pref[i] = nums[i] + pref[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--) {
            suff[i] = nums[i] + suff[i + 1];
        }
        for(int i = 0; i< nums.length; i++) {
            int diff = ((nums[i] * i) - pref[i]) + (suff[i] - (nums[i] * (nums.length - i - 1)));
            res[i] = diff;
        }
        return res;
    }
}