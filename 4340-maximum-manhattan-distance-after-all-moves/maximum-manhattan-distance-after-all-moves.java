class Solution {
    public int maxDistance(String moves) {
        int h=0,v=0,u=0;
        for(char ch : moves.toCharArray()){
            if(ch == 'U') v++;
            else if(ch == 'D') v--;
            else if(ch == 'L') h--;
            else if(ch == 'R') h++;
            else u++;
        }
        int ans = Math.abs(v) + Math.abs(h);
        return ans + u;
    }
}