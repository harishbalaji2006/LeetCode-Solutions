class Solution {
    public int maxDepth(String s) {
        int res = 0, c = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                c++;
                res = Math.max(c, res);
            } else if(ch == ')') {
                c--;
            }
        }
        return res;
    }
}