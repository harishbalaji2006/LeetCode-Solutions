class Solution {
    public long countCommas(long n) {
        if(n<=999) return 0;
        long s = 1000, res = 0;
        for(int i = 1; i <= 5; i++) {
            if(n >= s) res += (n - s + 1);
            s *= 1000;
        }
        return res;
    }
}