class Solution {
    public int maxProduct(int[] nums) {
        int maxSum = nums[0];
        for(int start = 0; start < nums.length;start++){
            int currSum = 1;
            for(int end = start ; end < nums.length;end++){
                currSum *= nums[end];
                maxSum = Math.max(maxSum , currSum);
            }
        }
        return maxSum;
    }
}