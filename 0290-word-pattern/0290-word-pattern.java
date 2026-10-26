class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = arr[i];
            // check contains or not if contain then check value is same or not
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                // check the vakue present ashel manje key match nahi zali if condition madhe manun direct false
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(ch, word);
            }
        }

        return true;
    }
}