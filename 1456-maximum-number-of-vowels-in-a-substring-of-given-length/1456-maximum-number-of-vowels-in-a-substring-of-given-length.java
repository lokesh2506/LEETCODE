class Solution {
    public int maxVowels(String s, int k) {
        if( k > s.length()) return 0;

        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        // intailise the window 

        int count = 0;
        int max = 0;

        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(vowels.contains(ch)){
                count++;
            }
        }

        max = Math.max(max,count);

        for(int i = k;i<s.length();i++){
            char incoming = s.charAt(i);
            char outgoing = s.charAt(i-k);
            if(vowels.contains(incoming)){
                count++;
            }

            if(vowels.contains(outgoing)){
                count--;
            }

            max = Math.max(max,count);
        }

        return max;

    }
}