class Solution {
    public int minimumDeletions(int[] nums) {
        int minel = nums[0];
        int maxel = nums[0];
        int minIndex = 0;
        int maxIndex = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxel){
                maxel = nums[i];
                maxIndex = i;
            }else if(nums[i]< minel){
                minel = nums[i];
                minIndex = i;
            }
        }
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);

        int option1 = right + 1;
        int option2 = nums.length - left;
        int option3 = left + 1 + nums.length - right;

        return Math.min(option1, Math.min(option2, option3));
    }
}