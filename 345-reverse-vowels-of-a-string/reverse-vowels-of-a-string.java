class Solution {
    public boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') return true;
        return false;
    }
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] arr = s.toCharArray();
        while(i < j) {
            boolean f1 = isVowel(arr[i]);
            boolean f2 = isVowel(arr[j]); 
            if(f1 && f2) {
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
            else if (!f1) {
                i++;
            }
            else {
                j--;
            }
        }
        return new String(arr);
    }
}