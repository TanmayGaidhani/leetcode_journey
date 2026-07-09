class Solution {
    public String reverseVowels(String s) {
       char ch[] = s.toCharArray();
       int start = 0;
       int end = ch.length-1;
        String str ="aeiouAEIOU";
        while(start < end){
            while(start < end && str.indexOf(ch[start])==-1){
                start++;
            }
            while(start < end && str.indexOf(ch[end])==-1){
                end--;
            }
            char temp = ch[start];
            ch[start]= ch[end];
            ch[end]= temp;

            start++;
            end--;
        }
        return new String(ch);
    }
}