class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int max = -1;
        for(int n : nums){
            if(hs.contains(-n)){
                max = Math.max(max,Math.abs(n));
            }
            hs.add(n);
        }
        return max;
    }
}