class Solution {
    public long[] resultArray(int[] nums, int k) {

        long[] ans = new long[k];

        // dp[r] = number of subarrays ending at previous index
        // whose product % k == r
        long[] dp = new long[k];

        for (int num : nums) {

            long[] newDp = new long[k];

            int value = num % k;

            // Start a new subarray with only num
            newDp[value]++;

            // Extend previous subarrays
            for (int r = 0; r < k; r++) {

                if (dp[r] > 0) {

                    int newRemainder = (r * value) % k;

                    newDp[newRemainder] += dp[r];
                }
            }

            // Add current subarrays to answer
            for (int r = 0; r < k; r++) {
                ans[r] += newDp[r];
            }

            dp = newDp;
        }

        return ans;
    }
}