class Solution {
    public int range(int n){
        int h = 0,l = 99999;
        while(n > 0){
            int k = n % 10;
            if(k > h) h = k;
            if(k < l) l = k;
            n /= 10;
        }
        return h - l;
    }
    public int maxDigitRange(int[] nums) {
        int max = 0;
        int sum = 0;
        for(int num :nums){
            int f = range(num);
            if(f > max) {
                max = f;
                sum=num;
            }
            else if(f == max) sum += num;
        }
        return sum;
    }
}