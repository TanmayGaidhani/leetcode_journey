import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Store all unique elements
        ArrayList<Integer> list = new ArrayList<>(map.keySet());

        //Sort based on frequency (descending)
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

        //Take first K elements
        int[] arr = new int[k];

        for (int i = 0; i < k; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}