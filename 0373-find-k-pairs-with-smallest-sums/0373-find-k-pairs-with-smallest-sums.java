class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        // Base condition
        if(nums1.length == 0 || nums2.length == 0|| k ==0){
            return result;
        }
        // comparitor use on the priority queue on the base of sum
        PriorityQueue<int []> minHeap = new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));

        // Intial stage taking 1 element from num2 and making pair with nums1 and add at the k pair

        for(int i =0;i<Integer.min(nums1.length,k);i++){
            // store the sum , index of nums1 and index of num2
            minHeap.offer(new int[]{nums1[i]+nums2[0],i,0});
        }
        while(k > 0 && !minHeap.isEmpty()){
            int []curr = minHeap.poll(); //retrun the smallest element
            int sum = curr[0];
            int i = curr[1];
            int j = curr[2];

            result.add(Arrays.asList(nums1[i],nums2[j]));
            k--;
            if(j+1 < nums2.length){
                int newSum = nums1[i]+nums2[j+1];
                minHeap.offer(new int[]{newSum,i,j+1});
            }
        }
        return result;
    }
}