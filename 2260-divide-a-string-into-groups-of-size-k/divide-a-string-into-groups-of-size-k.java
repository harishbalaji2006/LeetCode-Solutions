class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> li = new ArrayList<>();
        int mod = s.length()%k;
        while(mod!=0 && mod!=k){
            s+=fill;
            mod++;
        }
        //System.out.println(s);
        for(int i=0;i<s.length();i+=k){
            String str = s.substring(i,i+k);
            li.add(str);
        }
        String[] arr = new String[li.size()];
        for(int i=0;i<li.size();i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}