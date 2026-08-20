class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z\\s]", " ");

        String[] words = paragraph.split("\\s+");

        HashSet<String> set = new HashSet<>();

        for (String b : banned) {
            set.add(b.toLowerCase());
        }

        HashMap<String, Integer> map = new HashMap<>();

        for (String str : words) {

            if (set.contains(str)) {
                continue;
            }

            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        String ans = "";
        int max = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > max) {
                max = entry.getValue();
                ans = entry.getKey();
            }
        }

        return ans;
    }
}