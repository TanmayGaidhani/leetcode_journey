class Solution {
    public int hammingDistance(int x, int y) {
        // use xor beacuse both are diff bit then it one 
        int xor = x ^ y;
        String str = Integer.toBinaryString(xor);
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}