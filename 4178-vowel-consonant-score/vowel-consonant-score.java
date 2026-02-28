class Solution {
    public int vowelConsonantScore(String s) {
        int c1=0,c2=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    c1++;
                }
                else{
                    c2++;
                }
            
            }
        }
        if(c1==0 || c2==0){
            return 0;
        }
        return c1/c2;
    }
}