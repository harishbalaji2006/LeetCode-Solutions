class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double max = 0;
        int a=0,b=0;
        for(int[] d : dimensions){
            int n1 = d[0];
            int n2 = d[1];
            double k = Math.sqrt((n1*n1) + (n2*n2));
            if(k > max || (k == max && n1 * n2 > a * b)){
                max = k;
                a = n1;
                b = n2;
            }
        }
        return a * b;
    }
}