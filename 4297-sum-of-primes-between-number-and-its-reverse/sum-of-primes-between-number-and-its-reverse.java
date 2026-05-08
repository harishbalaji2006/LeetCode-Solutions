class Solution {
    public String reverse(String s){
        int i=0,j=s.length()-1;
        char[] arr=s.toCharArray();
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        return new String(arr);
    }
    public boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int sum=0;
        String str=reverse(String.valueOf(n));
        int num=Integer.parseInt(str);
        int st=Math.min(n,num);
        int end=Math.max(n,num);
        for(int i=st;i<=end;i++){
            if(isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
}