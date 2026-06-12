class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> li = new ArrayList<>();
        int mod = s.length()%k;
        while(mod!=0 && mod!=k){
            s+=fill;
            mod++;
        }
        String[] arr = new String[s.length()/k];
        System.out.println(s);
        for(int i=0;i<s.length();i+=k){
            String str = s.substring(i,i+k);
            li.add(str);
        }
        return li.toArray(new String[0]);
    }
}