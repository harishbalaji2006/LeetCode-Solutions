class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Boolean> li = new ArrayList<>();
        for(int i : candies) max = Math.max(i,max);
        for(int i : candies) {
            int s = i + extraCandies;
            if(s >= max) li.add(true);
            else li.add(false);
        }
        return li;
    }
}