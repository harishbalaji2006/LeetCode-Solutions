class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> li = new ArrayList<>();
        int c=1;
        for(int i=0;i<nums.length;i++){
            if(i> 0 && nums[i]!=nums[i-1]){
                c=1;
            }
            else if(i>0 && nums[i]==nums[i-1]){
                c++;
            }
            if(c<=k){
                li.add(nums[i]);
            }
        }
        int[] arr = new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}