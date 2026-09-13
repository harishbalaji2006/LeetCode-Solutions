class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        int c = 0;
        for(Map.Entry<Integer,Integer> en : hm.entrySet()) {
            if(en.getValue() == 3) {
                int f = -1, s = -1, t = -1;
                for(int i = 0; i < nums.length; i++) {
                    if(nums[i] == en.getKey()) {
                        if(f == -1) f = i;
                        else if(s == -1) s = i;
                        else t = i;
                    }
                }
                if(s - f == t - s) c++;
            }
        }
        return c;
    }
}