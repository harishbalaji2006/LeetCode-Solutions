import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> li = new ArrayList<>();
        String sp = Pattern.quote(Character.toString(separator));
        for(String s : words){
            String[] arr=s.split(sp);
            for(String k : arr){
                if(!k.isEmpty()) li.add(k);
            }
        }
        return li;
    }
}