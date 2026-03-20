class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int x=numBottles;
        int y=(numBottles-1)/(numExchange-1);
        return x+y;
    }
}