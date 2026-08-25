class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(num % k == 0){
                set.add(num);
            }
        }

        // for(int i=1;i<=nums.length+1;i++){
        //     if(! set.contains(i*k)){
        //         return i*k;
        //     }
        // }
        // return -1;

        int multiple = k;

        while(set.contains(multiple)) {

            multiple = multiple + k;

        }

        return multiple;
    }
}