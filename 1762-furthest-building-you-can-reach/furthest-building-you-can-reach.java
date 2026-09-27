class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int c = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 1; i < heights.length; i++) {
            if(heights[i] > heights[i - 1]) {
                int diff = heights[i] - heights[i - 1];
                pq.add(diff);
                bricks -= diff;
                if(bricks < 0) {
                    if(ladders > 0) {
                        bricks += pq.poll();
                        ladders--;
                    } else return c;
                }
            }
            c++;
        }
        return c;
    }
}