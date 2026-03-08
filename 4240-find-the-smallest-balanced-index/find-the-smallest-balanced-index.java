class Solution {
    public int smallestBalancedIndex(int[] nums) {
        long s=0,p=1;
        int i=0,j=nums.length-1;
        while(i!=j){
            if(s<p){
                s+=nums[i];
                i++;
            }
            else{
                p*=nums[j];
                j--;
            }
        }
        if(s==p)return i;
        return -1;
    }
}