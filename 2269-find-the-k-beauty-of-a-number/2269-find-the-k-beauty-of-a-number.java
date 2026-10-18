class Solution {
    public int divisorSubstrings(int num, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        String str = String.valueOf(num);

        for(int i =0;i<k;i++){
            sb.append(str.charAt(i));
        }
        
        for(int i = 0;i<=str.length()-k;i++){
            int n = Integer.parseInt(sb.toString());
            if (n != 0 && num % n == 0) {
                count++;
            }

            if (i < str.length() - k) {
                sb.deleteCharAt(0);
                sb.append(str.charAt(i + k));
            }
        }
        return count;
    }
}