class Solution {
    public int countAsterisks(String s) {
        int c=0;
        boolean f=false;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                f=!f;
            }
            else if(s.charAt(i)=='*' && !f){
                c++;
            }
        }
        return c;
    }
}