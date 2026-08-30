class Trie {
    List<String> li;
    public Trie() {
        li = new ArrayList<>();
    }
    
    public void insert(String word) {
        li.add(word);
    }
    
    public boolean search(String word) {
        for(String s : li) {
            if(s.equals(word)) return true;
        }
        return false;
    }
    
    public boolean startsWith(String prefix) {
        for(String s : li) {
            if(prefix.length() <= s.length()) {
                String k = s.substring(0,prefix.length());
                if(k.equals(prefix)) return true;
            }
        }
        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */