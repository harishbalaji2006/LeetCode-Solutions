class Solution {
    public int compareBitonicSums(int[] nums) {
        int max=nums[0];
        int idx=0;
        long s1=0,s2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        for(int i=0;i<=idx;i++){
            s1+=nums[i];
        }
        for(int i=idx;i<nums.length;i++){
            s2+=nums[i];
        }
        if(s1>s2) return 0;
        else if(s1<s2) return 1;
        return -1;
    }
}