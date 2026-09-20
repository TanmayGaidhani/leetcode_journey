class Solution {
    public int reverseDegree(String s) {
        String str = "zyxwvutsrqponmlkjihgfedcba";
        int res = 0;
        int degree = 1;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            res += (degree * (str.indexOf(ch)+1));
            degree++;
        }
        return res;
    }
}