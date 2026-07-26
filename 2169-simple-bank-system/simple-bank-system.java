class Bank {
    HashMap<Integer,Long> hm;
    public Bank(long[] balance) {
        hm = new HashMap<>();
        for(int i=0;i<balance.length;i++) {
            hm.put(i+1,balance[i]);
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if (!hm.containsKey(account1) || !hm.containsKey(account2)) {
            return false;
        }
        if(hm.get(account1) < money) return false;
        hm.put(account1,hm.get(account1) - money);
        hm.put(account2,hm.get(account2) + money);
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(!hm.containsKey(account)) return false;
        long k = hm.get(account);
        long tot = k + money;
        hm.put(account,tot);
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!hm.containsKey(account)) return false;
        if(hm.get(account) < money) return false;
        hm.put(account,hm.get(account) - money);
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */