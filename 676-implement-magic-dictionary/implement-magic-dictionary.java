class MagicDictionary {
    List<String> li;            
    public MagicDictionary() {
        li = new ArrayList<>();
    }
    
    public void buildDict(String[] dictionary) {
        for(String s : dictionary) li.add(s);
    }
    
    public boolean search(String searchWord) {
        for(String s : li) {
            int k = s.length();
            int l = searchWord.length();
            if(k == l) {
                int c = 0;
                for(int i = 0; i < k; i++) {
                    if(s.charAt(i) != searchWord.charAt(i)) c++;
                }
                if(c == 1) return true; 
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */