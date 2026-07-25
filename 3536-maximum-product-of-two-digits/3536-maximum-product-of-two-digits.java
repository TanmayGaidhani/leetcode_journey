class Solution {
    public int maxProduct(int n) {
        // int temp = n;
        int largest = 0;
        int secondLar = 0;

        while(n !=0){
            int digit = n % 10;

            if(digit >= largest){
                secondLar = largest;
                largest = digit;
            }else if (digit > secondLar) {
                secondLar = digit;
            }
            n =n/10;
        }

        return largest * secondLar;
    }
}