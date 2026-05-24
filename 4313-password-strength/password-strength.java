class Solution {
    public int passwordStrength(String password) {
        int strength=0;
        Set<Character> set = new HashSet<>();
        for(char ch : password.toCharArray()){
            set.add(ch);
        }
        for(char ch:set){
            if(Character.isUpperCase(ch)) strength+=2;
            else if(Character.isLowerCase(ch)) strength+=1;
            else if(Character.isDigit(ch)) strength+=3;
            else strength+=5;
        }
        return strength;
    }
}