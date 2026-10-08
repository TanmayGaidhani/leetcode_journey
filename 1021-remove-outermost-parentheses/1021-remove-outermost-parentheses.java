class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count =0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == '('){
                // count = 0 then not outermost
                if(count > 0){
                    ans.append(ch);
                }
                count++;
            }else{
                count--;
                // count > 0, not an outermost
                if(count > 0){
                    ans.append(ch);
                }
            }
        }
        return ans.toString();
    }
}