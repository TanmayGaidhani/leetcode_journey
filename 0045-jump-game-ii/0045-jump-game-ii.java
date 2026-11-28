class Solution {
    public int jump(int[] nums) {

        int totalJump = 0;
        int coverage = 0;
        int lastIndex = 0;
        int lastDist = nums.length - 1;

        if(nums.length == 1) return 0;

        for(int i = 0; i < nums.length; i++) {

            coverage = Math.max(coverage, i + nums[i]);

            if(i == lastIndex) {

                lastIndex = coverage;
                totalJump++;

                if(coverage >= lastDist) {
                    return totalJump;
                }
            }
        }

        return totalJump;
    }
}