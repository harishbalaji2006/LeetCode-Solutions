class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> li = new ArrayList<>();
        for(String s : words) {
            for(String k : words) {
                if(!s.equals(k) && k.contains(s)) {
                    li.add(s);
                    break;
                }
            }
        }
        return li;
    }
}