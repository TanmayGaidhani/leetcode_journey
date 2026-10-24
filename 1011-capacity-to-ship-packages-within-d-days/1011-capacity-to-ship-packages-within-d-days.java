class Solution {
    public static int getMax(int weights[]){
        int max = weights[0];
        for(int x : weights){
            max = Math.max(max,x);
        }
        return max;
    }
    public static int getSum(int weights[]){
        int sum = 0;
        for(int x : weights){
            sum += x;
        }
        return sum;
    }
    public static boolean canShip(int weights[],int days,int capacity){
        int dayCount = 1;
        int currLoad = 0; 
        for(int w :weights){
            if(currLoad + w > capacity){
                dayCount++;
                currLoad = 0;
            }
            currLoad += w;
            if(dayCount > days){
                return false;
            }
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = getMax(weights);
        int high = getSum(weights);
        while(low < high){
            int mid = low +(high - low)/2;

            if(canShip(weights,days,mid)){
                high = mid ;
            }else {
                low = mid + 1;
            }
        }
        return low;
    }
}