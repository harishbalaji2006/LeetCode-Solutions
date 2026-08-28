class Solution {
    public boolean digitCount(String num) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c: num.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int c=0;
        for(int i=0;i<num.length();i++) {
            char ch = (char) (i + '0');
            if((num.charAt(i) - '0') == hm.getOrDefault(ch,0)) c++;
        }
        if(c == num.length()) return true;
        return false;
    }
}