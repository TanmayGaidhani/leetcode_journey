class Solution {
    public int reverseBits(int n) {
       int result = 0;

        for(int i=0;i<32;i++){
            int bit = n & 1;  //get a last bit
            // Shift result left and add bit
            result = (result << 1) | bit;

            // Remove last bit from n
            n = n >>> 1;
        }

        return result;
    }
}