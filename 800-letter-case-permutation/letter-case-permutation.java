class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> li = new ArrayList<>();
        backtrack(li,s.toCharArray(),0);
        return li;
    }
    public void backtrack(List<String> li, char[] arr, int st) {
        if(st == arr.length) {
            li.add(new String(arr));
            return;
        }
        backtrack(li,arr,st + 1);
        if(Character.isLetter(arr[st])) {
            if(Character.isUpperCase(arr[st])) {
                arr[st] = Character.toLowerCase(arr[st]);
                backtrack(li,arr,st + 1);
            }else{
                arr[st] = Character.toUpperCase(arr[st]);
                backtrack(li,arr,st + 1);
            }
        }
    }
}