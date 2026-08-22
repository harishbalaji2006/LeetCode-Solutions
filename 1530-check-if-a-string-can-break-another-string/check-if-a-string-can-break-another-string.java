class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean f1 = true, f2 = true;
        for(int i=0;i<s1.length();i++) {
            if(arr1[i] < arr2[i]) f1 = false;
            if(arr2[i] < arr1[i]) f2 = false;
        }
        if(f1 || f2) return true;
        return false;
    }
}