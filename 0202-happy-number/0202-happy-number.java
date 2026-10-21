import java.util.HashSet;

class Solution {

    public static int digitSquare(int n){
        int sum = 0;

        while(n != 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }

    public boolean isHappy(int n) {

        // HashSet<Integer> set = new HashSet<>();

        // while(n != 1 && !set.contains(n)){
        //     set.add(n);
        //     n = digitSquare(n);
        // }

        // return n == 1;

        // Using slow & fast not require space

        int slow = digitSquare(n);
        int fast = digitSquare(digitSquare(n));

        while( slow != fast ){
            slow = digitSquare(slow);
            fast = digitSquare(digitSquare(fast));

            if(slow == 1 || fast == 1){
                return true;
            }
        }
        return slow == 1;
    }
}