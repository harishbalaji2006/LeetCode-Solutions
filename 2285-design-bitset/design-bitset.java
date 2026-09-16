class Bitset {
    StringBuilder sb;
    int ones = 0;
    boolean flipped = false;
    
    public Bitset(int size) {
        sb = new StringBuilder();
        while(size-- > 0) sb.append('0');
    }
    
    public void fix(int idx) {
        char current = sb.charAt(idx);
        if(!flipped) {
            if(current == '0') {
                sb.setCharAt(idx, '1');
                ones++;
            }
        } else {
            if(current == '1') {
                sb.setCharAt(idx, '0');
                ones++;
            }
        }
    }
    
    public void unfix(int idx) {
        char current = sb.charAt(idx);
        if(!flipped) {
            if(current == '1') {
                sb.setCharAt(idx, '0');
                ones--;
            }
        } else {
            if(current == '0') {
                sb.setCharAt(idx, '1');
                ones--;
            }
        }
    }
    
    public void flip() {
        flipped = !flipped;
        ones = sb.length() - ones;
    }
    
    public boolean all() {
        return ones == sb.length();
    }
    
    public boolean one() {
        return ones > 0;
    }
    
    public int count() {
        return ones;
    }

    public String toString() {
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            if(flipped) {
                ans.append(c == '0' ? '1' : '0');
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }
}