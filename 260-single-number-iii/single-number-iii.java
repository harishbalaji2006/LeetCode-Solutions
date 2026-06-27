class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> li = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> en : hm.entrySet()){
            if(en.getValue() == 1){
                li.add(en.getKey());
            }
        }
        int[] arr = new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}