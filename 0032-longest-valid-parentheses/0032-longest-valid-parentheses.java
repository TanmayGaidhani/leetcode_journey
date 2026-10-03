class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);  // Boundary valid substring start
        int maxLength = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)== '('){
                stack.push(i);  //store then index of (
            }else{
                stack.pop(); //Remove the matching '('

                if(stack.isEmpty()){
                    //  this ) not matched then become new bounday
                    stack.push(i);
                }else{
                    // length of currnt valid substring
                    int current = i- stack.peek();
                    maxLength =Math.max(maxLength , current);
                }
            }
        }
        return maxLength;
    }
}