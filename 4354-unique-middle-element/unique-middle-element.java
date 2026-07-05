class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer,Integer> hm  = new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        int mid = nums[nums.length/2];
        int freq = hm.getOrDefault(mid,0);
        if(freq == 1) return true;
        return false;
    }
}