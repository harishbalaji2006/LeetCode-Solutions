class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[2*nums.length];
        k=k%nums.length;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            arr[i+nums.length]=nums[i];
        }
        int st=nums.length-k;
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[st+i];
        }
    }
}