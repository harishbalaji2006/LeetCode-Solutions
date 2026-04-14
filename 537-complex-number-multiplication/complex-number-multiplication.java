class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String str="";
        String[] n1=num1.split("\\+");
        String[] n2=num2.split("\\+");
        int a=Integer.parseInt(n1[0]);
        int b=Integer.parseInt(n1[1].replace("i",""));
        int c=Integer.parseInt(n2[0]);
        int d=Integer.parseInt(n2[1].replace("i",""));
        int r=(a*c)-(b*d);
        int i=(a*d)+(b*c);
        str+=Integer.toString(r);
        str+='+';
        str+=Integer.toString(i);
        str+='i';
        return str;
    }
}