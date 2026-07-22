class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = Integer.toString(num);
        int c = 0;
        for(int i=0;i<=str.length() - k;i++) {
            String s = str.substring(i,i+k);
            int f = Integer.parseInt(s);
            if(f != 0 && num % f == 0) c++;
        }
        return c;
    }
}