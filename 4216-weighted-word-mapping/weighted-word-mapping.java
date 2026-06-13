class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String str = "";
        for(String s : words){
            int sum = 0;
            char arr[] = s.toCharArray();
            for(char ch :arr){
                sum+=weights[ch-'a'];
            }
            int mod = sum%26;
            char c = (char)('z' - mod);
            str+=c;
        }
        return str;
    }
}