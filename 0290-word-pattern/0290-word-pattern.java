class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();

        String [] patternArr = s.split(" ");

        if(pattern.length() != patternArr.length) return false;

        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                if(!map.get(ch).equals(patternArr[i])){
                    return false;
                }
            }else if(map.containsValue(patternArr[i])){
                return false;
            }

            
            map.put(ch,patternArr[i]);
        }

        return true;
    }
}