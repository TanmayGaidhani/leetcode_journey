class Solution {
    public int minimumDeletions(int[] nums) {
        int minel = nums[0];
        int maxel = nums[0];
        int minIndex = 0;
        int maxIndex = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>maxel){
                maxel = nums[i];
                maxIndex = i;
            }else if(nums[i]< minel){
                minel = nums[i];
                minIndex = i;
            }
        }

        int deleteFromFront = Math.max(maxIndex, minIndex) + 1;
        int deleteFromBack = n - Math.min(maxIndex, minIndex);
        int deleteFromBothSide = (Math.min(maxIndex, minIndex) + 1) + (n - Math.max(maxIndex, minIndex));

        // Return minimum of all options
        return Math.min(deleteFromBothSide, Math.min(deleteFromFront, deleteFromBack));
    }
}