class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    public String toGoatLatin(String sentence) {
        String[] s = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length;i++){
            int k = i+1;
            if(isVowel(s[i].charAt(0))){
                sb.append(s[i]);
                sb.append("ma");
                while(k > 0){
                    sb.append("a");
                    k--;
                }
                sb.append(" ");
            }
            else{
                int len = s[i].length();
                char c = s[i].charAt(0);
                String f = s[i].substring(1,len);
                f+=c;
                sb.append(f);
                sb.append("ma");
                while(k > 0){
                    sb.append("a");
                    k--;
                }
                sb.append(" ");
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}