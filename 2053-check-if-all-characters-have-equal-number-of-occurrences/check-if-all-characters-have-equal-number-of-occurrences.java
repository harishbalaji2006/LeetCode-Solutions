class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        HashSet<Integer> hs =new HashSet<>(hm.values());
        if(hs.size()==1) return true;
        return false;
    }
}