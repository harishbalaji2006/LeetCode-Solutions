class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(!hm.containsKey(nums[i])) hm.put(nums[i], new ArrayList<>());
            hm.get(nums[i]).add(i);
        }
        int c = 0;
        for(Map.Entry<Integer, ArrayList<Integer>> en : hm.entrySet()) {
            List<Integer> li = en.getValue();
            if(li.size() >= 3) {
                HashSet<Integer> hs = new HashSet<>();
                for(int i = 0; i < li.size() - 1; i++) {
                    hs.add(li.get(i + 1) - li.get(i));
                }
                if(hs.size() == 1) c++;
            }
        }

        return c;
    }
}