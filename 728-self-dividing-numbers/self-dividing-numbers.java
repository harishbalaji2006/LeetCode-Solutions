class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(div(i)) li.add(i);
        }
        return li;
    }
    private boolean div(int n){
        int t=n;
        while(t>0){
            int d=t%10;
            if(d==0 || n%d!=0) return false;
            t=t/10;
        }
        return true;
    }
}