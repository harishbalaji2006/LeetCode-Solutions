class Solution {
    public int largestInteger(int[] nums, int k) {
        int samp = -1;
        for(int i = 0;i<nums.length;i++) {
            samp = Math.max(nums[i],samp);
        }
        if(k == nums.length) {
            return samp;
        }
        int max = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i <= nums.length - k; i++) {
            for(int j = i; j < i + k; j++) {
                hm.put(nums[j],hm.getOrDefault(nums[j], 0) + 1);
            }
        }
        for(Map.Entry<Integer,Integer> en : hm.entrySet()) {
            if(en.getValue() == 1 && en.getKey() > max) {
                max = en.getKey();
            }
        }
        return max;
    }
}