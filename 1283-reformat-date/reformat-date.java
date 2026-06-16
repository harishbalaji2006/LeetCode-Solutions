class Solution {
    public String reformatDate(String date) {
        HashMap<String,String> hm = new HashMap<>();
        hm.put("Jan","-01");hm.put("Feb","-02");hm.put("Mar","-03");hm.put("Apr","-04");hm.put("May","-05");hm.put("Jun","-06");hm.put("Jul","-07");hm.put("Aug","-08");hm.put("Sep","-09");hm.put("Oct","-10");hm.put("Nov","-11");hm.put("Dec","-12");
        String[] arr = date.split(" ");
        StringBuilder sb = new StringBuilder();
        String str = arr[0];
        String num = "";
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){
                num+=str.charAt(i);
            }
        }
        sb.append(arr[2]);
        sb.append(hm.get(arr[1]));
        sb.append("-");
        if(Integer.parseInt(num)>=10){
            sb.append(num);
        }
        else{
            sb.append("0");
            sb.append(num);
        }
        return sb.toString();
    }
}