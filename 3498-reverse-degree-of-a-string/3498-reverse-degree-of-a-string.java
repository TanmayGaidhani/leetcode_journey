class Solution {
    public int reverseDegree(String s) {
        // String str = "zyxwvutsrqponmlkjihgfedcba";
        // int res = 0;
        // int degree = 1;
        // for(int i=0; i<s.length();i++){
        //     char ch = s.charAt(i);
        //     res += (degree * (str.indexOf(ch)+1));
        //     degree++;
        // }
        // return res;

        int sum=0;
        int product=1;
        for(int i=0;i<s.length();i++){
            int index=s.charAt(i)-'a';
            int reverse=26-index;
            product=(i+1)*reverse;
            sum=sum+product;
        }
        return sum;
    }
}