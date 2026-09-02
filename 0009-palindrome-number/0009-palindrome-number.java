class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int reversedNumber = 0;

        if(x < 0) return false;

        while(x > 0){
            int reminder = x % 10; // it will give the last didgit of the x
            reversedNumber = (reversedNumber * 10) + reminder;
            x /= 10; // here we are removing the last digit from the number 
        }

        return originalNumber == reversedNumber;
    }
}