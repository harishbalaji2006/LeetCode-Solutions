class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        List<Integer> li =new ArrayList<>();
        for(int[] q : queries){
            int min = q[0];
            int max = q[1];
            int xor = 0;
            for(int i=min;i<=max;i++){
                xor^=arr[i];
            }
            li.add(xor);
        }
        int[] res = new int[li.size()];
        for(int i=0;i<li.size();i++){
            res[i] = li.get(i);
        }
        return res;
    }
}