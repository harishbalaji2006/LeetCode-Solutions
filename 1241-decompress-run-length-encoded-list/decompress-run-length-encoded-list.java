class Solution {
    public int[] decompressRLElist(int[] nums) {
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0) len+=nums[i];
        }
        int[] arr=new int[len];
        int idx=0;
        for(int i=0;i<nums.length;i+=2){
            int n=nums[i];
            int val=nums[i+1];
            for(int j=0;j<n;j++){
                arr[idx++]=val;
            }
        }
        return arr;
    }
}