class Solution {
    public int mySqrt(int x) {
        int c=0;
        int odd=1;
        while(x>=odd){
            x-=odd;
            odd+=2;
            c++;
        }
        return c;
    }
}