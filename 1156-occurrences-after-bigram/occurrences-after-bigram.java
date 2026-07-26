class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> li = new ArrayList<>();
        String[] arr = text.split(" ");
        for(int i=2;i<arr.length;i++) {
            if(arr[i-1].equals(second) && arr[i-2].equals(first)) {
                li.add(arr[i]);
            }
        }
        String[] res = new String[li.size()];
        for(int i=0;i<li.size();i++) {
            res[i] = li.get(i);
        }
        return res;
    }
}