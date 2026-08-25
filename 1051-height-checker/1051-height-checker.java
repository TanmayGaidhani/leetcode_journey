class Solution {
    public int heightChecker(int[] heights) {
        int dupli[]=heights.clone();
        Arrays.sort(dupli);
        int count=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=dupli[i]){
                count++;
            }
        }
        return count;
    }
}