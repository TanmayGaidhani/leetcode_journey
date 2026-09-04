class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        for(int i=0;i<n;i++){
            // Find maximum from 0 to i
            int max = Integer.MIN_VALUE;
            for (int j = 0; j <= i; j++) {
                max = Math.max(max, nums[j]);
            }

            // find the minimum from i to n-1
            int min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++) {
                min = Math.min(min, nums[j]);
            }

            //checking stability
            if(max - min <= k){
                return i;
            }
        }
        return -1;
    }
}