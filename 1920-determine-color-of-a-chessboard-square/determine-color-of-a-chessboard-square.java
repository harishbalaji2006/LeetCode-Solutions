class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] c=coordinates.toCharArray();
        int a=c[0];
        int b=c[1];
        int k=a+b;
        if(k%2==0) return false;
        return true;
    }
}