class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        backtrack(result,"",0,0,n);

        return result;
    }
    public static void backtrack(List<String>result, String current,int open,int close,int n){
        // used all parathesis multiply by 2 karan open and close aahe
        if(current.length() == 2*n){
            result.add(current);
            return;
        }
        // add ( open parathesis aahe manun
        if(open < n){
            backtrack(result,current+"(",open+1,close,n);
        }

        // Add ) jewa open lahil tewa
        if(close < open){
            backtrack(result,current +")",open,close+1,n);
        }
    }
}