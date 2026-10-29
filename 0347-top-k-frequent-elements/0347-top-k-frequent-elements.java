class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // HashMap<Integer, Integer> map = new HashMap<>();
        // for (int num : nums) {
        //     map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        // //Store all unique elements
        // ArrayList<Integer> list = new ArrayList<>(map.keySet());
        // //Sort based on frequency (descending)
        // Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        // //Take first K elements
        // int[] arr = new int[k];

        // for (int i = 0; i < k; i++) {
        //     arr[i] = list.get(i);
        // }

        // return arr;

        // using priorityQueue and min an dmax heap concept
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // we use the min heap and compare the element on the base of frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)-> Integer.compare(map.get(a),map.get(b)));

        for(int val : map.keySet()){
            pq.add(val);
            if(pq.size()>k){
                pq.poll();  //remove the smallest element frequencies
            }
        }
        int result[] = new int[k];

        for(int i = k-1;i>=0;i--){
            result[i]=pq.poll();
        }
        return result;
    }
}