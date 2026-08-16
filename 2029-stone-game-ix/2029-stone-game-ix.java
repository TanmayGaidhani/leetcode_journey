class Solution {
    public boolean stoneGameIX(int[] stones) {
        int cnt[]= new int[3];

        for(int stone : stones){
            cnt[stone % 3]++;
        }
        // remainder 1 or 2 nahi aala manje alice sum cannot divisible by 3
        if (cnt[1] == 0 && cnt[2] == 0) {
            return false;
        }
        // If the number of 0-remainder stones is even,
        // Alice wins when both types 1 and 2 exist, or when one type has at least 2 more stones than the other.
        if (cnt[0] % 2 == 0) {
            return cnt[1] > 0 && cnt[2] > 0;
        }

        // If cnt[0] is odd
        return Math.abs(cnt[1] - cnt[2]) > 2;
    }
}