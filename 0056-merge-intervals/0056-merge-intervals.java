class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        int end = 0;
        // sort the array according to first element  --- lamba function use
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0])); 
        int res[][] = new int[n][2];  // start and end aahet manun n and 2
        res[0]=intervals[0]; //after sorting 1st element always smaller than all and it starting point
        for(int i =0;i<n;i++){
            if(intervals[i][0] <= res[end][1]){
                res[end][1] = Math.max(res[end][1] , intervals[i][1]);
                // comparing start and last and store the maximnun for the find the interval
            }else{
                end++;
                res[end] = intervals[i];
            }
        }
        // all array print nahi karne aahe after merge wala print karne aahe manun
        return Arrays.copyOfRange(res,0,end+1);
    }
}