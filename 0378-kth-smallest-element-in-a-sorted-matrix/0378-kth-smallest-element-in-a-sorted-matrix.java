class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // using max heap using priorityQueue
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int n = matrix.length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                maxHeap.add(matrix[i][j]);

                if(maxHeap.size() > k){
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();
    }
}