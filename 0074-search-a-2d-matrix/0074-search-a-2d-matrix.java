class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // int row = 0;
        // int col = matrix[0].length-1;
        // while(row < matrix.length && col >= 0){
        //     if(matrix[row][col]==target){
        //         return true;
        //     }else if( target < matrix[row][col]){
        //         col--;
        //     }else{
        //         row++;
        //     }
        // }
        // return false;

        int m = matrix.length;
        int n = matrix[0].length;
        if(m == 0) return false;
        int start = 0;
        int end = m*n-1; //last index of 2d array

        while(start <= end){
            int mid = (start+end)/2;
            int element = matrix[mid/n][mid%n];

            if(element == target){
                return true;
            }else if(element > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}