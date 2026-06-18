class Solution {
    public double angleClock(int hour, int minutes) {
        if(hour == 12) hour = 0;
        double n1 = hour * 30 + minutes * 0.5;
        double n2 = 6 * minutes;
        double res = Math.abs(n1-n2);
        return Math.min(res, 360 -res);
    }
}