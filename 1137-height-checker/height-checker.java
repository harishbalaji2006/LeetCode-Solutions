class Solution {
    public int heightChecker(int[] heights) {
        int[] e=new int[heights.length];
        int c=0;
        for(int i=0;i<heights.length;i++){
            e[i]=heights[i];
        }
        int j=0;
        while(j<e.length-1){
            if(e[j]>e[j+1]){
                int t=e[j];
                e[j]=e[j+1];
                e[j+1]=t;
                j=0;
            }
            else{
                j++;
            }
        }
        for(int i=0;i<heights.length;i++){
            if(heights[i] != e[i]) c++;
        }
        return c;
    }
}