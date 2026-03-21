class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> et:hm.entrySet()) {
            if (et.getValue()==1) {
                return et.getKey();
            }
        }
        return 0;
    }
}