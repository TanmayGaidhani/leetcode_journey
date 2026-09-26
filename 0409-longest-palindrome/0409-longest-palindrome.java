class Solution {
    public int longestPalindrome(String s) {
        // case sensitive aahe manun 128 size cha aaray
        int []freq = new int[128];
        int length = 0;

        for(char ch : s.toCharArray()){
            freq[ch]++;
        }
        for(int count : freq){
            length += (count / 2)*2;

            if(length % 2 == 0 && count % 2 == 1){
                length++;
            }
        }
        return length;
    }
}