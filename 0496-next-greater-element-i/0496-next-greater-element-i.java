class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            int target = nums1[i];
            int ans = -1;
            boolean found = false;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == target) {
                    found = true;
                }
                else if (found && nums2[j] > target) {
                    ans = nums2[j];
                    break;
                }
            }
            nums1[i] = ans;
        }
        return nums1;
    }
}