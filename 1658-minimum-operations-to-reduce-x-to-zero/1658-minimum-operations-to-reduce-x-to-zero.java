class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int totalSum = 0; // calculating totalsum

        for(int num : nums){
            totalSum += num;
        }

        int target = totalSum - x;
        // target never negative
        if(target < 0){
            return -1;
        }

        if(target == 0){ // Remove all the element
            return n;
        }

        int left = 0;
        int sum = 0;
        int maxLength = -1;

        // SlidingWindow problem
        for(int right = 0;right < n;right++){
            sum += nums[right];
            // id sum greater than target
            while(sum > target && left <= right){
                sum -= nums[left];
                left++;
            }
            // sum == target subarray
            if(sum == target){
                maxLength = Math.max(maxLength, right - left +1);
            }
        }
        // not valid subarray
        if(maxLength == -1){
            return -1;
        }

        return n-maxLength;
    }
}