class Solution {
    public int secondHighest(String s) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)) ts.add(ch-'0');
        }
        if(ts.size()<=1) return -1;
        return ts.lower(ts.last());
    }
}