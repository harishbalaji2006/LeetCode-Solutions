class Solution {
    public String discountPrices(String sentence, int discount) {
        String[] arr = sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            if(arr[i].matches("\\$\\d+$")){
                long amt = Long.parseLong(arr[i].substring(1));
                double dis = discount/100.0;
                double amt2 = amt*dis;
                double price = amt-amt2;
                arr[i] = String.format("$%.2f",price);
            }
        }
        return String.join(" ",arr);
    }
}