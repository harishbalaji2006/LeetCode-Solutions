class Solution {
    public boolean isFascinating(int n) {
        int n1=n*2;
        int n2=n*3;
        String str=""+Integer.toString(n)+Integer.toString(n1)+Integer.toString(n2);
        if(str.length()!=9) return false;
        HashSet<Character> hs=new HashSet<>();
        for(char c:str.toCharArray()){
            if(c=='0') return false;
            hs.add(c);
        }
        if(hs.size()==9){
            return true;
        }
        return false;  
    }
}