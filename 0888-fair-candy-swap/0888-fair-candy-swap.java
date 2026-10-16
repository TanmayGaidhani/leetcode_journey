class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        HashSet<Integer> set = new HashSet<>();

        int sumA = 0;
        int sumB = 0;

        for(int x : aliceSizes){
            sumA += x;
        }

        for(int y : bobSizes){
            set.add(y);
            sumB += y;
        }

        int diff = (sumA - sumB)/2;

        for(int x : aliceSizes){
            int required = x - diff;

            if(set.contains(required)){
                return new int[] {x, required};
            }
        }
        return new int[0];
    }
}