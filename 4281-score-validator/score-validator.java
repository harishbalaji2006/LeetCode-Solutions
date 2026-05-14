class Solution {
    public int[] scoreValidator(String[] events) {
        int count=0,score=0;
        int[] arr=new int[2];
        for(String s:events){
            if(s.equals("W")){
                count++;
            }
            if(s.equals("NB") || s.equals("WD")){
                score++;
            }
            if(s.matches("[0-9]+")){
                int num=Integer.parseInt(s);
                score+=num;
            }
            if(count==10){
                break;
            }
        }
        arr[0]=score;
        arr[1]=count;
        return arr;
    }
}