class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int [] arr = new int[26];

        for(int i=0;i<s.length();i++){
            int num = s.charAt(i);
            num -= 97;

            arr[num]++;
        }

        for(int i=0;i<t.length();i++){
            int num = t.charAt(i);
            num -= 97;

            arr[num]--;
        }

        for(int i=0;i<26;i++){
            if(arr[i] != 0) return false;
        }

        return true;
    }
}