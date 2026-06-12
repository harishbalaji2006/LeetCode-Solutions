class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int c=0;
        for(int i=0;i<colors.length;i++){
            if(colors[i]!=colors[(i+1)%colors.length] && colors[(i+1)%colors.length]!=colors[(i+2)%colors.length]){
                c++;
            }
        }
        return c;
    }
}