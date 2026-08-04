class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        List<Integer> li = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) {
            min = Math.min(min,num);
            max = Math.max(max,num);
            hs.add(num);
        }
        for(int i=min;i<=max;i++){
            if(!hs.contains(i)) li.add(i);
        }
        return li;
    }
}