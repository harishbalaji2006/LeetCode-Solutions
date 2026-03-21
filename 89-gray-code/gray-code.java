class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> li = new ArrayList<>();
        int num=(int)Math.pow(2,n);
        for(int i=0;i<num;i++){
            int res=i^i>>1;
            li.add(res);
        }
        return li;
    }
}