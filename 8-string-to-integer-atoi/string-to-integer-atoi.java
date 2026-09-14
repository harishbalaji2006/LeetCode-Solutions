class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1;
        long num = 0;
        while(i < s.length() && s.charAt(i) == ' ') i++;
        if(i < s.length() && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
            if(s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        while(i < s.length() && Character.isDigit(s.charAt(i))) {
            int k = s.charAt(i) - '0';
            num = num * 10 + k;
            if(sign * num <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if(sign *num >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int)num * sign;
    }
}