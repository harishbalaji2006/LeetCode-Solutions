class Solution {
    public int minFlips(int a, int b, int c) {
        int res1 = a | b;
        int res2 = res1 ^ c;
        return Integer.bitCount(res2) + Integer.bitCount((a&b)&res2);
    }
}