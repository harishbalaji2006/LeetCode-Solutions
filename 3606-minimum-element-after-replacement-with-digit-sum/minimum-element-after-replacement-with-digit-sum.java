class Solution {
    public int minElement(int[] nums) {
        int min=9999;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                int s=0;
                while(nums[i]>0){
                    int rem=nums[i]%10;
                    s+=rem;
                    nums[i]/=10;
                }
                nums[i]=s;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}