class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String str="";
        for(String k : words){
            char[] arr=k.toCharArray();
            str+=arr[0];
        }
        if(str.equals(s)) return true;
        return false;
    }
}