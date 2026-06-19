class Solution {
    public int matchPlayersAndTrainers(int[] p, int[] t) {
        Arrays.sort(p);
        Arrays.sort(t);
        int c = 0;
        int i = 0, j = 0;
        while(i < p.length && j < t.length){
            if(p[i] <= t[j]){
                c++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return c;
    }
}