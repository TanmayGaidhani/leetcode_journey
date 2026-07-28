class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int answer = 0;
        for(int value : map.values()){
            int digit = value*(value-1) / 2;
            answer += digit;
        }
        return answer;
    }
}