class Solution {
    public int subarraySum(int[] nums, int k) {
        // int left = 0;
        // int count = 0;
        // int sum = 0;
        // if(nums.length == 1 && k == nums[0]){
        //     return 1;
        // }
        // if(nums.length == 1 && k != nums[0]){
        //     return 0;
        // }
        // for(int right = 0;right < nums.length;right++){
        //     sum += nums[right];
            
        //     while(sum > k){
        //         sum -= nums[left];
        //         left++;
        //     }
        //     if(k == sum){
        //         count++; 
        //         sum -= nums[left];
        //         left++;
        //     }
        // }
        // return count; // not work for negative number

        HashMap<Integer,Integer> map = new HashMap<>();
        int sum =0;
        int count = 0;
        map.put(0,1);
        for(int i =0;i< nums.length;i++){
            sum += nums[i];

            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}