class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int result[]= new int[arr1.length];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int index = 0;
        for (int num : arr2) {
            if (map.containsKey(num)) {

                int count = map.get(num);

                while (count > 0) {
                    result[index++] = num;
                    count--;
                }

                map.remove(num);
            }
        }
        // Remaining elements
        ArrayList<Integer> remaining = new ArrayList<>();

        for (int num : map.keySet()) {
            int count = map.get(num);

            while (count > 0) {
                remaining.add(num);
                count--;
            }
        }
        Collections.sort(remaining);

        for (int num : remaining) {
            result[index++] = num;
        }

        return result;

    }
}