class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sort = new String(arr);
            if(!hm.containsKey(sort)){
                hm.put(sort,new ArrayList<>());
            }
            hm.get(sort).add(s);
        }
        //System.out.println(hm);
        List<List<String>> li = new ArrayList<>();
        for(List<String> list : hm.values()){
            li.add(list);
        }
        return li;
    }
}