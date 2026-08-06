class Solution {
    public int pro(int num) {
        int res = 1;
        while(num > 0) {
            res *= (num % 10);
            num /= 10;
        }
        return res;
    } 
    public int smallestNumber(int n, int t) {
        for(int i = n;i<=n + 10;i++) {
            int dig = pro(i);
            if(dig % t == 0) return i;
        }
        return -1;
    }
}