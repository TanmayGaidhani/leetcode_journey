class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {

        HashMap<String, Integer> map = new HashMap<>();

        String[] arr1 = s1.split(" ");
        String[] arr2 = s2.split(" ");

        for (String str : arr1) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (String str : arr2) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        ArrayList<String> list = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        return list.toArray(new String[0]);
    }
}