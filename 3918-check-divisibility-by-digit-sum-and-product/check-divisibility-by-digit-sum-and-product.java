class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int temp=n;
        while(n>0){
            int t=n%10;
            s+=t;
            p*=t;
            n/=10;
        }
        int sum=s+p;
        if(sum==0) return false;
        if(temp%sum==0){
            return true;
        }
        return false;
    }
}