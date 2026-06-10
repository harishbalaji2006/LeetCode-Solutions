class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        String str="";
        for(int i=0;i<s.length();i++){
            int n = (int)s.charAt(i) - 96;
            str+=Integer.toString(n);
        }
        for(int i=0;i<str.length();i++){
            sum = sum + (str.charAt(i)-'0');
        }
        k--;
        while(k!=0){
            int res=sum;
            sum=0;
            while(res!=0){
                int rem=res%10;
                sum+=rem;
                res/=10;
            }
            k--;
        }
        return sum;
    }
}