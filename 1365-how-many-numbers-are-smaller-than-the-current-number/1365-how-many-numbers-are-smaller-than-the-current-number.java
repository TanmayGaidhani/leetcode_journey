class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int sorted[] = nums.clone();
        Arrays.sort(sorted);
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<sorted.length;j++){
                if(nums[i]==sorted[j]){
                    ans[i]=j;
                    break;
                }
            }
        }
        return ans;
    }
}