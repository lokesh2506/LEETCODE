class Solution {
    public boolean isIsomorphic(String s, String t) {
        int size1 = s.length();
        int size2 = t.length();

        if(size1 != size2) return false;

        int i=0;

        HashMap<Character,Character>map1 = new HashMap<>();
        HashMap<Character,Character>map2 = new HashMap<>();

        while(i<size1){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map1.containsKey(ch1) && map1.get(ch1) != ch2) return false;
            if(map2.containsKey(ch2) && map2.get(ch2) != ch1) return false;

            map1.put(ch1,ch2);
            map2.put(ch2,ch1);
            i++;
        }

        return true;
    }
}