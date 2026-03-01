class Solution {
    public int minPartitions(String n) {
        int c=0;
        for(char ch:n.toCharArray()){
            if(ch-'0' > c){
                c=ch-'0';
            }
        }
        return c;
    }
}