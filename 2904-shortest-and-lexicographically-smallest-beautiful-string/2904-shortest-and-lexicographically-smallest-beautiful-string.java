class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        ArrayList<Integer> ones = new ArrayList<>();
        int n = s.length();
        // for storing one;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                ones.add(i);
            }
        }
        // edge case
        if (ones.size() < k) {
            return "";
        }

        String ans ="";

        for (int i = 0; i <= ones.size() - k; i++) {

            int start = ones.get(i);
            int end = ones.get(i + k - 1);

            String candidate = s.substring(start, end + 1);
            //  comparing substring lexically
            if (ans.equals("") || candidate.length() < ans.length()) {
                ans = candidate;
            }
            else if (candidate.length() == ans.length()
                    && candidate.compareTo(ans) < 0) {
                ans = candidate;
            }
        }
        return ans;
    }   
}