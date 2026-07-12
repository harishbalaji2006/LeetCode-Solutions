class Solution {
    public int reverse(int num){
        int rev = 0;
        while(num > 0){
            int dig = num % 10;
            rev = rev * 10 + dig;
            num /= 10;
        }
        return rev;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hs.add(nums[i]);
            hs.add(reverse(nums[i]));
        }
        return hs.size();
    }
}