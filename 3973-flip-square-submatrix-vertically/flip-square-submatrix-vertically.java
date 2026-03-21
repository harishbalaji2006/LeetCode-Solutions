class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        for(int i=0;i<k/2;i++){
            for(int j=0;j<k;j++){
                int temp=grid[x+i][y+j];
                grid[x+i][y+j]=grid[x-1+k-i][y+j];
                grid[x-1+k-i][y+j]=temp;
            }
        }
        return grid;
    }
}