class Solution {
    public String arrangeWords(String text) {
        StringBuilder sb = new StringBuilder();
        text = text.toLowerCase();
        String[] arr = text.split(" ");
        Arrays.sort(arr,(a,b) -> a.length() - b.length());
        for(String s : arr){
            sb.append(s);
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }
}