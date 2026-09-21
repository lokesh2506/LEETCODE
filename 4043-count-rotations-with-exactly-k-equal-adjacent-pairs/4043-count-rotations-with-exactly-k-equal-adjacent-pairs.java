class Solution {
    public int countRotations(String s, int k) {
        int count = 0;
        int size = s.length();

        int rotation = 0;

        for(int i=0;i<size-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                rotation++;
            }
        }

        if(rotation == k) count++;

        int j = 1;

        char ch = s.charAt(size-1);
        while(j<size){
            if(s.charAt(j) ==  s.charAt(j-1)){
                rotation--;
            }

            if(s.charAt(j-1) == ch){
                rotation++;
            }

            ch = s.charAt(j-1);


            if(rotation == k) count++;
            j++;
        }

        return count;       
    }
}