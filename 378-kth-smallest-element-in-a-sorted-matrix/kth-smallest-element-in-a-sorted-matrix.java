class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                li.add(matrix[i][j]);
            }
        }
        Collections.sort(li);
        int res = li.size() - k;
        return li.get(li.size() - 1 - res);
    }
}