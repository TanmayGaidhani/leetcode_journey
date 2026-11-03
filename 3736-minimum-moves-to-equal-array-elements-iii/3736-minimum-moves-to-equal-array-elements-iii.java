class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int x : nums){
            max =Math.max(x,max);
        }
        int moves = 0;
        for(int num : nums){
            moves += max-num;
        }
        return moves;
    }
}