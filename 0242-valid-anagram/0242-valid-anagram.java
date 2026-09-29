class Solution {
    public boolean isAnagram(String s, String t) {
        int size1 = s.length();
        int size2 = t.length();

        if(size1 != size2) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0;i<size1;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<size1;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)-1);

            if(map.get(t.charAt(i)) == 0) map.remove(t.charAt(i));
        }

        return map.size() == 0;

    }
}