class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro1=1;
        int pro2=1;
        int[] n1=new int[nums.length];
        int[] n2=new int[nums.length];
        int[] fin=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            n1[i]=pro1;
            pro1*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            n2[i]=pro2;
            pro2*=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            fin[i]=n1[i]*n2[i];
        }
        return fin;
    }
}