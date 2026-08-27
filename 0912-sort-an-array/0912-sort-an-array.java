class Solution {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, 0, nums.length - 1);

        return nums;
    }

    public void mergeSort(int[] nums, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }

    public void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        // Compare left and right parts
        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Remaining left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Remaining right part
        while (j <= end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp into original array
        for (k = 0; k < temp.length; k++) {
            arr[start + k] = temp[k];
        }
    }
}