class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int ogSize = s.length();
        int targetSize = p.length();

        if(ogSize < targetSize) return new ArrayList<>();

        HashMap<Character,Integer> targetMap = new HashMap<>();
        for(int i =0; i<targetSize; i++){
            char ch1 = p.charAt(i);
            targetMap.put(ch1,targetMap.getOrDefault(ch1,0)+1);
        }

        HashMap<Character,Integer> map = new HashMap<>();
        Set<Integer> list = new HashSet<>();

        int j=0;
        for(int i=0;i<ogSize;i++){
            char ch1 = s.charAt(i);

            if(targetMap.containsKey(ch1)){
                map.put(ch1,map.getOrDefault(ch1,0)+1);
            }else{
                map.clear();
                j = i+1;
            }

            // abca a-2 not acceptable
            if(i-j+1 > targetSize){
                char ch2 = s.charAt(j);
                map.put(ch2,map.get(ch2)-1);

                if(map.get(ch2) == 0 ) map.remove(ch2);

                j++;
            }

           if (i - j + 1 == targetSize && map.equals(targetMap)) {
                list.add(j);
            }

        }

        return new ArrayList<>(list);

        
    }
}