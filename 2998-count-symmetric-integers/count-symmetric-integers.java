class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String s=String.valueOf(i);
            if(s.length()%2==0){
                String str1="";
                String str2="";
                for(int j=0;j<s.length()/2;j++){
                    str1+=s.charAt(j);
                }
                for(int k=s.length()/2;k<s.length();k++){
                    str2+=s.charAt(k);
                }
                int s1=0,s2=0;
                int num1=Integer.parseInt(str1);
                int num2=Integer.parseInt(str2);
                while(num1>0){
                    int t=num1%10;
                    s1+=t;
                    num1=num1/10;
                }
                while(num2>0){
                    int t=num2%10;
                    s2+=t;
                    num2/=10;
                }
                if(s1==s2){
                    c++;
                }
            }
        }
        return c;
    }
}