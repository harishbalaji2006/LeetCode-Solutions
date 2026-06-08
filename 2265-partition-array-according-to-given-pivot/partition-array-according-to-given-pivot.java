class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                li.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                li.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                li.add(nums[i]);
            }
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}