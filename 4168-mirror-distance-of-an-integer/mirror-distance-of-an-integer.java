class Solution {
    public int mirrorDistance(int n) {
        String str=Integer.toString(n);
        StringBuilder sb=new StringBuilder(str);
        int n1=Integer.parseInt(sb.reverse().toString());
        int x=Math.abs(n-n1);
        return x;
    }
}