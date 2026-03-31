class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            char[] a=s.toCharArray();
            int i=0,j=s.length()-1;
            while(i<j){
                char t=a[i];
                a[i]=a[j];
                a[j]=t;
                i++;
                j--;
            }
            String str1=new String(a);
            if(str1.equals(s)){
                return str1;
            }
        }
        return "";
    }
}