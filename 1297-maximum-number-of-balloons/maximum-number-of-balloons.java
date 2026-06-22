class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : text.toCharArray()){
            if(ch=='b' || ch=='a' || ch == 'l' || ch=='o' || ch=='n'){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }
        int b = hm.getOrDefault('b',0);
        int a = hm.getOrDefault('a',0);
        int l = hm.getOrDefault('l',0)/2;
        int o = hm.getOrDefault('o',0)/2;
        int n = hm.getOrDefault('n',0);
        int[] arr = {b,a,l,o,n};
        int min = 99999;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}