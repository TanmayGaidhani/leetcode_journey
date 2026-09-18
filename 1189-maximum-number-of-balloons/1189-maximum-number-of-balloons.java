class Solution {
    public int maxNumberOfBalloons(String text) {
        // int freq[] = new int[26];

        // for(char ch: text.toCharArray()){
        //     freq[ch-'a']++;
        // }
        // int b = freq['b' - 'a'];
        // int a = freq['a' - 'a'];
        // int l = freq['l' - 'a'] / 2;    // karan 2 l and o aahet manun 2 ni divide 
        // int o = freq['o' - 'a'] / 2;
        // int n = freq['n' - 'a'];

        // return Math.min(Math.min(Math.min(b, a), Math.min(l, o)),n);

        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;

        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b': b++; break;
                case 'a': a++; break;
                case 'l': l++; break;
                case 'o': o++; break;
                case 'n': n++; break;
            }
        }
        return Math.min(b,Math.min(a,Math.min(n,Math.min(l/2,o/2))));
    }
}