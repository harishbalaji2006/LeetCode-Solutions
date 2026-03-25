class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length()<26) return false;
        HashSet<Character> hs=new HashSet<>();
        for(char ch:sentence.toCharArray()){
            hs.add(ch);
        }
        if(hs.size()==26) return true;
        return false;
    }
}