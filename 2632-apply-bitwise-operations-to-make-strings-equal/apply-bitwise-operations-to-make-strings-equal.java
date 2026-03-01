class Solution {
    public boolean makeStringsEqual(String s, String target) {
        if(s.contains("1") == target.contains("1")){
            return true;
        }
        return false;
    }
}