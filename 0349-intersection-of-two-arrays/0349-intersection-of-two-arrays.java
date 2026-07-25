class Solution {    public int[] intersection(int[] nums1, int[] nums2) {

        if (nums1.length == 0) {
            return nums1;
        }

        if (nums2.length == 0) {
            return nums2;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        int n = Math.min(nums1.length, nums2.length);
        int[] arr = new int[n];
        int count = 0;

        for (int i = 0; i < nums2.length; i++) {

            if (set.contains(nums2[i])) {
                arr[count] = nums2[i];
                count++;

                set.remove(nums2[i]);
            }
        }

        int[] ans = new int[count];

        for (int i = 0; i < count; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }
}