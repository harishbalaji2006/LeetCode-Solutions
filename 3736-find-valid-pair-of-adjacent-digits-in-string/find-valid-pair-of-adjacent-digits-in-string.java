class Solution {
    public String findValidPair(String s) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < s.length() - 1; i++) {
            int f = s.charAt(i) - '0';
            int g = s.charAt(i + 1) - '0';
            if(f == hm.get(s.charAt(i)) && g == hm.get(s.charAt(i + 1)) && s.charAt(i) != s.charAt(i + 1)) {
                sb.append(s.charAt(i));
                sb.append(s.charAt(i + 1));
                break;
            }
        }
        return sb.toString();
    }
}