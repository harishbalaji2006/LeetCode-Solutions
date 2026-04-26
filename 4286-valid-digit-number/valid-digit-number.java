class Solution {
    public boolean validDigit(int n, int x) {
        String str=String.valueOf(n);
        char ch=(char)(x+'0');
        boolean flag=false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                flag=true;
            }
        }
        if(str.charAt(0)!=ch && flag){
            return true;
        }
        return false;
    }
}