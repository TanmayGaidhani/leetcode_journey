class Solution {
    public String convertToBase7(int num) {
        if(num == 0){
            return "0";
        }
        boolean negative = num < 0;
        num = Math.abs(num);
        String res = "";

        while(num > 0){
            int digit = num % 7;
            res = digit + res;   // add digit at LEFT
            num = num / 7;
        }

        if(negative){
            res = "-"+res;
        }
        return res;
    }
}