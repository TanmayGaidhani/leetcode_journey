class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         // float a = Math.abs(nums[i]-nums[j]);
        //         if(nums[i]==nums[j]){
        //             if(Math.abs(i-j) <= k){
        //                 return true;
        //             }
        //         }
        //     }
        // }

        HashSet<Integer> set = new HashSet<>();

        for(int i =0;i<nums.length;i++){

            if( i > k){
                set.remove(nums[i- k - 1]);  //element window chy baher jat aaahe
            }

            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}