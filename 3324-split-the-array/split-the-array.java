class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        if(nums.length%2!=0) return false;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> en : hm.entrySet()){
            if(en.getValue()>2) return false;
        }
        return true;
    }
}