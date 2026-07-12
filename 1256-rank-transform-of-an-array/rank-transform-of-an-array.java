class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i=0;i<arr.length;i++) temp[i] = arr[i];
        Arrays.sort(temp);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int r = 1;
        for(int n : temp){
            if(!hm.containsKey(n)){
                hm.put(n,r);
                r++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
}