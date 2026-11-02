class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        // find the middle/ element
        int middle = nums[nums.length / 2];
        int moves = 0;
        for(int x : nums){
            moves += Math.abs(middle - x);
        }
        return moves;
    }
}