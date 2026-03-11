class Solution {
    public int bitwiseComplement(int n) {
        String str=Integer.toBinaryString(n);
        char[] s=str.toCharArray();
        for(int i=0;i<s.length;i++){
            if(str.charAt(i)=='1'){
                s[i]='0';
            }
            else{
                s[i]='1';
            }
        }
        String str2=new String(s);
        int num=Integer.parseInt(str2,2);
        return num;

    }
}