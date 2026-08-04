class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        List<Integer> li = new ArrayList<>();
        List<Integer> li1 = new ArrayList<>();
        for(int num : nums) {
            min = Math.min(min,num);
            max = Math.max(max,num);
            li.add(num);
        }
        for(int i=min;i<=max;i++){
            if(!li.contains(i)) li1.add(i);
        }
        return li1;
    }
}