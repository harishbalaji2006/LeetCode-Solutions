class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> en : hm.entrySet()) {
            if(en.getValue() > max) {
                max = en.getValue();
            }
        }
        int c = 0;
        for(Map.Entry<Integer,Integer> en : hm.entrySet()) {
            if(en.getValue() == max) c++;
        }
        return c * max;
    }
}