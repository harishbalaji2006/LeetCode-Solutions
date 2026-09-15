class Solution {
    public int candy(int[] ratings) {
        int c = 0;
        int[] arr = new int[ratings.length];
        for(int i = 0; i < ratings.length; i++) arr[i] = 1;
        for(int i = 1; i < ratings.length; i++) {
            if(ratings[i] > ratings[i - 1]) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        for(int i = ratings.length - 1; i > 0; i--) {
            if(ratings[i - 1] > ratings[i]) {
                arr[i - 1] = Math.max(arr[i] + 1, arr[i - 1]);
            }
            c += arr[i - 1];
        }
        return c + arr[ratings.length - 1];
    }
}