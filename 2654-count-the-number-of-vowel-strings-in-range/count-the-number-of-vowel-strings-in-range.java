class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int c=0;
        for(int i=left;i<=right;i++){
            char[] arr = words[i].toCharArray();
            if(isVowel(arr[0]) && isVowel(arr[arr.length-1])){
                c++;
            }
        }
        return c;
    }
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}