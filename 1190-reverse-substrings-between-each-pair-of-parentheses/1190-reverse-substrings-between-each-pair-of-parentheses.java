class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(ch == '('){
                // save the current string
                stack.push(current.toString());
                // Start form fresh string
                current = new StringBuilder();
            }else if(ch == ')'){
                // Reverse the current substring
                current.reverse();

                // get previous string
                String previous = stack.pop();

                // join string
                current = new StringBuilder(previous + current);
            }else{
                current.append(ch);  // normal character
            }
        }
        return current.toString();
    }
}