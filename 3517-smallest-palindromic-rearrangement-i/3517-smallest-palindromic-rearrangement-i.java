class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n == 1){
            return s;
        }
        int freq[]= new int[26];

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder str = new StringBuilder();
        char middle = '\0';

        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                str.append((char)('a'+i));
            }
            if (freq[i] % 2 == 1) {
                middle = (char) ('a' + i);
            }
        }
        String right = new StringBuilder(str).reverse().toString();

        if (middle != '\0') {
            return str.toString() + middle + right;
        }

        return str.toString() + right;
    }
}