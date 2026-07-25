class Solution {
    public int maxProduct(int n) {
        int fm = 0, sm = 0;
        while(n > 0) {
            int k = n % 10;
            if(k > fm) {
                sm = fm;
                fm = k;
            }
            else if(k > sm) sm = k;
            n /= 10;
        }
        return fm * sm;
    }
}