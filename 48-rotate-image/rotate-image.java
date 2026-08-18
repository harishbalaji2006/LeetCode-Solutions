class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=i+1;j<matrix.length;j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        int idx = 0;
        for(int i = 0; i < matrix.length; i++) {
            int st = 0, end = matrix.length - 1;
            while(st < end) {
                int t = matrix[i][st];
                matrix[i][st] = matrix[i][end];
                matrix[i][end] = t;
                st++;
                end--;
            } 
        }
    }
}