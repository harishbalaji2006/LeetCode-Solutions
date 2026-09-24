class Solution {
    private int sod(int n){
        int s=0;
        while(n>0){
            int d=n%10;
            s+=d;
            n/=10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(sod(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}