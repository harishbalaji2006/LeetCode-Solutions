class Solution {
    public String reverse(String s) {
        int i = 0,j = s.length() - 1;
        char[] str = s.toCharArray();
        while(i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        return new String(str);
    }
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String itr : arr) {
            String k = reverse(itr);
            sb.append(k);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}