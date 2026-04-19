class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()==1) return "";
        char[] pal=palindrome.toCharArray();
        for(int i=0;i<pal.length/2;i++){
            if(pal[i]!='a'){
                pal[i]='a';
                return new String(pal);
            }
        }
        pal[pal.length-1]='b';
        return new String(pal);
    }
}