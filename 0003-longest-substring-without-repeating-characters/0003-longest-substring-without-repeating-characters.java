class Solution {
    public int lengthOfLongestSubstring(String s) {
        // StringBuilder str = new StringBuilder();
        // int maxLen = 0;

        // for (int i = 0; i < s.length(); i++) {
        //     char ch = s.charAt(i);

        //     int idx = str.indexOf(String.valueOf(ch));
        //     if (idx != -1) {
        //         str.delete(0, idx + 1);
        //     }

        //     str.append(ch);
        //     maxLen = Math.max(maxLen, str.length());
        // }

        // return maxLen;

        // using hashset two pointer approach
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for(int right = 0;right < s.length();right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);  //right - left +1  show the window size
        }
        return maxLength;
    }
}
