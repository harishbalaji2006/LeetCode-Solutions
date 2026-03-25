class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        List<Integer> li = new ArrayList<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> ent:hm.entrySet()){
            if(ent.getValue()>nums.length/3){
                li.add(ent.getKey());
            }
        }
        return li;
        
    }
}