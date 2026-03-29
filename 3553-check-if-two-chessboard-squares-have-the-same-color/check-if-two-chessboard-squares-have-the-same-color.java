class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        char[] c1=coordinate1.toCharArray();
        char[] c2=coordinate2.toCharArray();
        int a=c1[0]-'0' + c1[1]-'0';
        int b=c2[0]-'0' + c2[1]-'0';
        return a%2 == b%2;
    }
}