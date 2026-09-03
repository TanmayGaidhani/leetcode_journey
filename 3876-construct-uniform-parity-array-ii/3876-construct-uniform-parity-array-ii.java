class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;

        for(int num : nums1){
            min = Math.min(min,num);
        }

        // if minimum element is odd then we can makr all element odd
        if(min % 2 != 0){
            return true;
        }

        // If minimum is even, check whether all numbers are even
        for (int num : nums1) {
            if (num % 2 != 0) {
                return false;
            }
        }

        return true;

    }
}