class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            boolean flag = true;

            while(flag && asteroid < 0 && !stack.isEmpty() && stack.peek()>0){
                int top = stack.peek();

                if(top < -asteroid){
                    stack.pop();
                }else if(top == -asteroid){
                    stack.pop();
                    flag = false;
                }else{
                    flag = false;
                }
            }
            if(flag){
                stack.push(asteroid);
            }
        }
        int[] res = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }

        return res;
    }
}