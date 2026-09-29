class Solution {
    public String removeStars(String s) {
        // Stack<Character> stack = new Stack<>();
        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);

        //     if(ch != '*'){
        //         stack.push(ch);
        //     }else{
        //         stack.pop();
        //     }
        // }
        // StringBuilder result = new StringBuilder();

        // while (!stack.isEmpty()) {
        //     result.append(stack.pop());
        // }
        // return result.reverse().toString();

        StringBuilder stack = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '*') {
                stack.deleteCharAt(stack.length() - 1);
            } else {
                stack.append(c);
            }
        }

        return stack.toString();
    }
}