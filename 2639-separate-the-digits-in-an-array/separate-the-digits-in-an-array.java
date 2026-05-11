class Solution {
    public int[] separateDigits(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=10){
                c++;
            }
        }
        if(c==0){
            return nums;
        }
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            for(char ch:s.toCharArray()){
                li.add(ch-'0');
            }
        }
        int[] arr=new int[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i]=li.get(i);
        }
        return arr;
    }
}