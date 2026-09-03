class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);
        int reverse = 0;
        

        while(num!=0){
            int reminder = num%10;

            if(reverse > Integer.MAX_VALUE/10 || reverse < Integer.MIN_VALUE / 10) return 0;
            
            reverse = (reverse*10)+reminder;
            num/=10;
        }

        if(x<0){
            return -reverse;
        }
        return reverse;
    }
}