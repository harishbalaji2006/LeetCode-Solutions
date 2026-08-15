class Solution {
    public int sod(int n) {
        int s = 0;
        while (n > 0) {
            s += (n % 10);
            n /= 10;
        }
        return s;
    }

    public int largestInteger(int n, int s) {
        if (s == 0)
            return 0;
        List<Integer> li = new ArrayList<>();
        int itr = (int) Math.pow(10, n);
        for (int i = 1; i <= itr - 1; i++) {
            if (sod(i) == s)
                li.add(i);
        }
        if(li.isEmpty()) return -1;
        return li.getLast();
    }
}