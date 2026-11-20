class Solution {
    public int findComplement(int num) {
        String result = "";
        String binary =  Integer.toBinaryString(num);

        for(int i =0;i<binary.length();i++){
            char ch = binary.charAt(i);
            if(ch == '1'){
                result+='0';
            }else{
                result += '1';
            }
        }
        return Integer.parseInt(result,2);
    }
}