class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> li = new ArrayList<>();
        String[] arr = s.split(" ");
        for(String str:arr){
            if(str.matches("\\d+")){
                li.add(Integer.parseInt(str));
            }
        }
        int[] sort=new int[li.size()];
        sort[0]=li.get(0);
        for(int i=1;i<li.size();i++){
            if(sort[i-1]<li.get(i)){
                sort[i]=li.get(i);
            }
            else{
                return false;
            }
        }
        return true;
    }
}