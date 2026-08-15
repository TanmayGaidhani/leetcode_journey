class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean hasZero = false;

        for(int num : nums){
            xor ^= num;
            //  condition for only checking any one number is not zero
            if(num != 0){
                hasZero = true;
            }
        }
        if(!hasZero){
            return 0;
        }

        if(xor != 0){
            return nums.length;
        }

        return nums.length-1;
    }
}