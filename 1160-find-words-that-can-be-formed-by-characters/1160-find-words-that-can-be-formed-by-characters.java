class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];

        for (char ch : chars.toCharArray()) {
            freq[ch - 'a']++;
        }

        int length = 0;

        for(String word : words){
            int copy[] = freq.clone();
            boolean canForm = true;

            for(char ch : word.toCharArray()){
                copy[ch - 'a']--;

                if(copy[ch - 'a'] < 0){
                    canForm = false;
                    break;
                }

            }
            if (canForm) {
                length += word.length();
            }
        }
        return length;
    }
}