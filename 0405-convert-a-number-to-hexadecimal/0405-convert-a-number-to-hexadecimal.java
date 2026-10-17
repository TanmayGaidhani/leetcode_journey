class Solution {
    public String toHex(int num) {
        //  not valid inbuild function
        // String hex = Integer.toHexString(num);
        // return hex;
        if(num == 0){
            return "0";
        }
         
        String digit = "0123456789abcdef";
        StringBuilder hex = new StringBuilder();

        while (num != 0) {
            int remainder = num & 15;
            hex.append(digit.charAt(remainder));
            num >>>= 4;
        }
        return hex.reverse().toString();
    }
}