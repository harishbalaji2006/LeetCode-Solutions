class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        String s1="",s2="",s3="";
        for(char ch : firstWord.toCharArray()){
            int num = (int)ch - 97;
            s1+=Integer.toString(num);
        }
        for(char ch : secondWord.toCharArray()){
            int num = (int)ch - 97;
            s2+=Integer.toString(num);
        }
        for(char ch : targetWord.toCharArray()){
            int num = (int)ch - 97;
            s3+=Integer.toString(num);
        }
        int sum = Integer.parseInt(s1) + Integer.parseInt(s2);
        int res = Integer.parseInt(s3);
        if(sum == res) return true;
        return false;
    }
}