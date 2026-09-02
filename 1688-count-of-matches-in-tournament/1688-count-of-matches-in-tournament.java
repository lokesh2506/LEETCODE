class Solution {
    public int numberOfMatches(int n) {
        int noOfMatches = 0;

        while (n != 1){
            if(n%2 == 0){
                n = n/2;
                noOfMatches += n;
            }else{
                noOfMatches += (n-1)/2;
                n = (n-1)/2+1;
            }
        }

        return noOfMatches;
    }
}