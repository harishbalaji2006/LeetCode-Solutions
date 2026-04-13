class Solution {
    public int sum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }
    public int countEven(int num) {
        int s=sum(num);
        if(s%2==0) return num/2;
        return (num-1)/2;
    }
}