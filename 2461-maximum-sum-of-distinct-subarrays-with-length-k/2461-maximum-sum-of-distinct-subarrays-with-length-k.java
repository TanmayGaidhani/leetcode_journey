class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();  // for preventing duplicate element in subarray
        long currSum = 0 , maxSum = 0;
        int left = 0;

        for(int right = 0;right <nums.length;right++){
            // check condition of window size and duplicate
            while(set.contains(nums[right]) || k == set.size()){
                set.remove(nums[left]);
                currSum -= nums[left];
                left++;
            }
            currSum += nums[right];
            set.add(nums[right]);
            if(right-left+1>k){
                set.remove(nums[left]);
                currSum-=nums[left];
                left++;
            }
            if(set.size() == k){
                maxSum = Math.max(maxSum,currSum);
            }
        }
        return maxSum;
    }
}