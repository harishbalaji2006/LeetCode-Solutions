class Solution {
    public String reverse(String rev) {
        char[] arr = rev.toCharArray();
        int i = 0, j = rev.length() - 1;
        while(i < j) {
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return new String(arr);
    }
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            int k = ch;
            String f = Integer.toBinaryString(k);
            int len = f.length();
            int dif = 8 - len;
            while(dif-- > 0) sb.append("0");
            sb.append(f);
        }
        String str = sb.toString();
        //System.out.print(str);
        String r = reverse(str);
        if(str.equals(r)) return true;
        return false;
    }
}