class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0;
        for(List<String> li : items) {
            if(ruleKey.equals("type") && li.get(0).equals(ruleValue)) c++;
            if(ruleKey.equals("color") && li.get(1).equals(ruleValue)) c++;
            if(ruleKey.equals("name") && li.get(2).equals(ruleValue)) c++;
        }
        return c;
    }
}