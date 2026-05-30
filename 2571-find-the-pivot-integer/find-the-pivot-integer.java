class Solution {
    public int pivotInteger(int n) {
        int s1=0,s2=0;
        int[] pref = new int[n+1];
        int[] suff = new int[n+1];
        for(int i=1;i<=n;i++){
            s1+=i;
            pref[i]=s1;;
        }
        for(int i=n;i>=1;i--){
            s2+=i;
            suff[i]=s2;
        }
        for(int i=1;i<=n;i++){
            if(pref[i]==suff[i]){
                return i;
            }
        }
        return -1;
    }
}