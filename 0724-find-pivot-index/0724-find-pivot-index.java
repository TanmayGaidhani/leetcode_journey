class Solution {
    public int pivotIndex(int[] nums) {
        //    bruite force
        int total = 0;
        for(int x: nums){
            total += x;
        }
        int leftSum = 0;
        for(int i =0;i<nums.length;i++){
            int rightSum = total - leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}