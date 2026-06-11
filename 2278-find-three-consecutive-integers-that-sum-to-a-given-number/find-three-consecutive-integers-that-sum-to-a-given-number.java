class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0) return new long[0];
        long[] arr = new long[3];
        long n1 = num/3;
        arr[0] = n1-1;
        arr[1] = n1;
        arr[2] = n1+1;
        return arr;
    }
}