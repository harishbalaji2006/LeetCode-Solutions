class Solution {
    public boolean checkPowersOfThree(int n) {
        String str="";
        while(n>0){
            int rem=n%3;
            str+=Integer.toString(rem);
            n=n/3;
        }
        if(str.contains("2")) return false;
        return true;
    }
}