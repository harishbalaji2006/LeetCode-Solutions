class SmallestInfiniteSet {
    HashSet<Integer> hs;
    int ptr;
    public SmallestInfiniteSet() {
        hs = new HashSet<>();
        ptr = 1;
    }
    
    public int popSmallest() {
        if(!hs.isEmpty()) {
            int min = Collections.min(hs);
            hs.remove(min);
            return min;
        }
        return ptr++;
    }
    
    public void addBack(int num) {
        if(ptr > num) hs.add(num);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */