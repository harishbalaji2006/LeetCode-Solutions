class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i:nums){
            int c=0;
            int s=0;
            for(int j=1;j*j<=i;j++){
                if(i%j==0){
                    int a=i/j;
                    c++;
                    s+=j;
                    if(j!=a){
                        c++;
                        s+=a;
                    }
                }
                if(c>4) break;
            }
            if(c==4) sum+=s;
        }
        return sum;
    }
}