class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        for(int i=nums.length-1;i>nums.length-(k+1);i--){
            li.add(nums[i]);
        }
        //System.out.print(li);
        int m=mul;
        long s=0;
        for(int i=0;i<li.size();i++){
            if(m>0){
                s += (long)li.get(i)*m;
                m--;
            }
            else{
                s+=li.get(i);
            }
        }
        return s;
    }
}