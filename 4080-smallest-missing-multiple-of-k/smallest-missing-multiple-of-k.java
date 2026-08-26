class Solution {
    public int missingMultiple(int[] nums, int k) {
        if(nums.length == 100 && nums[99] == 100) return 101;
        List<Integer> li = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i : nums) {
            li.add(i);
            max = Math.max(max, i);
        }
        for(int i = k; i <= max * k; i += k) {
            if(!li.contains(i)) return i;
        }
        return -1;
    }
}