class Solution {
    public boolean isIsomorphic(String s, String t) {
        int size1 = s.length();
        int size2 = t.length();

        if(size1 != size2) return false;


        HashMap<Character,Character>map = new HashMap<>();

        for(int i=0;i<size1;i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if(map.containsKey(ch1) ){
                if(map.get(ch1) != ch2){
                    return false;
                }
            }else if(map.containsValue(ch2)){
                return false;
            }

        
            map.put(ch1,ch2);
        }

        return true;
    }
}