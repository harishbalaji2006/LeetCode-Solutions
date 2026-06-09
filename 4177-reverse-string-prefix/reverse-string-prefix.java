class Solution {
    public String reversePrefix(String s, int k) {
        if(k==1) return s;
        char[] arr = s.toCharArray();
        int i=0,j=k-1;
        while(i<j){
            char t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;j--;
        }
        return new String(arr);
    }
}