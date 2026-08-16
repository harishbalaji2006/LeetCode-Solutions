class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min = Integer.MAX_VALUE;
        int idx = -1;
        for(int i=0;i<drones.length;i++) {
            int k = Math.abs(drones[i][0] - target[0]);
            int l = Math.abs(drones[i][1] - target[1]);
            int s = k + l;
            if(s <= drones[i][2] && s < min) {
                min = s;
                idx = i;
            } 
        }
        return idx;
    }
}