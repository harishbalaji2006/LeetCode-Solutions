class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else{
                neg.add(nums[i]);
            }
        }
        int[] arr = new int[nums.length];
        int p=0,n=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i]=pos.get(p++);
            }
            else{
                arr[i]=neg.get(n++);
            }
        }
        return arr;
    }
}