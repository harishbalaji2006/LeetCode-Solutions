class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s=0;
        int t=x;
        while(t>0){
            int rem=t%10;
            s+=rem;
            t/=10;
        }
        if(x%s!=0){
            return -1;
        }
        else{
            return s;
        }
    }
}