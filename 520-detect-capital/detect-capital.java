class Solution {
    public boolean detectCapitalUse(String word) {
        
        return word.equals(word.toUpperCase()) || word.equals(word.toLowerCase()) || word.matches("^[A-Z][a-z]*$");
    }
}