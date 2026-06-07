class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] arr=new int[word.length()];
        long div=0;
        for(int i=0;i<word.length();i++){
            div = (div*10+word.charAt(i)-'0') % m;
            if(div==0){
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
        return arr;
    }
}