class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap <Character,String> hm = new HashMap<>();
        List <String> li = new ArrayList<>();
        hm.put('2',"abc"); hm.put('3',"def");hm.put('4',"ghi");hm.put('5',"jkl");hm.put('6',"mno");hm.put('7',"pqrs");hm.put('8',"tuv");hm.put('9',"wxyz");
        backtrack(0,digits,"",hm,li);
        return li;
    }
    public void backtrack(int idx,String digits,String st,HashMap<Character,String>hm,List<String>li){
        if(idx==digits.length()){
            li.add(st);
            return;
        }
        String str=hm.get(digits.charAt(idx));
        for(char ch:str.toCharArray()){
            backtrack(idx+1,digits,st+ch,hm,li);
        }
    }
}