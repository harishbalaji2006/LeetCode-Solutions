class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            int k=s.charAt(i)-'0';
            hm.put(k,hm.getOrDefault(k,0)+1);
        }
        int score=0;
        for(Map.Entry<Integer,Integer> en : hm.entrySet()){
            int key=en.getKey();
            int val=en.getValue();
            int tot=key*val;
            score+=tot;
        }
        return score;
    }
}