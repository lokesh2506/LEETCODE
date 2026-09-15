class Solution {
    public int countRotations(String s, int k) {
        int size = s.length();
        int ans = 0;


        int score = 0;
        for(int i=0;i<size-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                score++;
            }
        }

        if(k == score) ans++;

        // Rotation
        for(int i=1;i<size;i++){
            if(s.charAt(i-1) == s.charAt(i)){
                score--;
            }
            if(s.charAt(i-1) == s.charAt((i-2+size)%size)){
                score++;
            }

            if(k == score) ans++;
        }

        return ans;
    }
}