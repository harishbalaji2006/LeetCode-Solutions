class Solution {
    public char value(String str){
        int res = 0;
        for(char ch:str.toCharArray()){
            res += ch - 'a';
        }
        res%=26;
        return (char)('a' + res);
    }
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=k){
            String a = s.substring(i,i+k);
            sb.append(value(a));
        }
        return sb.toString();
    }
}