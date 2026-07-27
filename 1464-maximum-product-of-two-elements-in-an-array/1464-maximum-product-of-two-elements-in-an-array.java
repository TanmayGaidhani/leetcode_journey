class Solution {
    public int maxProduct(int[] nums) {
        // int n = nums.length-1;
        // Arrays.sort(nums);

        // return (nums[n]-1)*(nums[n-1]-1);

        int max1=0;
        int max2=0;
        for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max2=num;
            }
        }
        return (max1 - 1)*(max2 -1);
    }
}