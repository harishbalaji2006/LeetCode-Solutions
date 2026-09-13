class Solution {
    public boolean isSubstringPresent(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            String k = s.substring(i, i + 2);
            String r = "";
            r += k.charAt(1);
            r += k.charAt(0);
            if(s.contains(r)) return true;
        }
        return false;
    }
}