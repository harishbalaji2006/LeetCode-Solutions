class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ls=new int[nums.length];
        int[] rs=new int[nums.length];
        int[] res=new int[nums.length];
        int s1=0,s2=0;
        ls[0]=0;
        rs[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            ls[i]=ls[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rs[i]=nums[i+1]+rs[i+1];
        }
        for(int i=0;i<nums.length;i++){
            res[i]=Math.abs(ls[i]-rs[i]);
        }
        return res;
    }
}