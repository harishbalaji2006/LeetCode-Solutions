class Solution {
    public boolean checkString(String s) {
        if(s.matches("b+")) return true;
        if(s.charAt(0)=='b') return false;
        List<Integer> li =new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                li.add(i);
            }
        }
        for(int i=0;i<li.size()-1;i++){
            int a=li.get(i);
            int b=li.get(i+1);
            int diff=b-a;
            if(diff>1){
                return false;
            }
        }
        return true;
    }
}