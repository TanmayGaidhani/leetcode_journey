class Solution {
    public int hammingDistance(int x, int y) {
        // use xor beacuse both are diff bit then it one 
        int xor = x ^ y;
        // String str = Integer.toBinaryString(xor);
        // int count = 0;
        // for(int i = 0;i<str.length();i++){
        //     if(str.charAt(i)=='1'){
        //         count++;
        //     }
        // }
        // return count;
        int ans = 0;
        // Count number of set bits
        while(xor > 0) {

            ans += xor & 1;

            xor = xor >> 1;
        }

        return ans;
    }
}