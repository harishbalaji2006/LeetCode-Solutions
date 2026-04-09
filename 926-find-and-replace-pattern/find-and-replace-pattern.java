class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String>li=new ArrayList<>();
        for(String s:words){
            if(isomorphic(s,pattern)){
                li.add(s);
            }
        }
        return li;
    }
    public boolean isomorphic(String str,String pat){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<pat.length();j++){
                if(str.charAt(i)==str.charAt(j) && pat.charAt(i)!=pat.charAt(j) || str.charAt(i)!=str.charAt(j) && pat.charAt(i)==pat.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }
}