class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        if(p.length() > s.length()) return list;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        int left = 0;
        int count = p.length();

        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);

            int val = map.getOrDefault(ch,0);
            if(val > 0) count--;
            map.put(ch,val-1);

            if(right-left+1 > p.length()){
                char leftChar = s.charAt(left);

                int leftVal = map.getOrDefault(leftChar,0);
                if(leftVal >=0 ) count++;
                map.put(leftChar,leftVal+1);

                left++;
            }

            if(count == 0) list.add(left);
        }

        return list;
    }
}

// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         int ogSize = s.length();
//         int targetSize = p.length();

//         if(ogSize < targetSize) return new ArrayList<>();

//         HashMap<Character,Integer> targetMap = new HashMap<>();
//         for(int i =0; i<targetSize; i++){
//             char ch1 = p.charAt(i);
//             targetMap.put(ch1,targetMap.getOrDefault(ch1,0)+1);
//         }
//         Set<Integer> list = new HashSet<>();

//         int j=0;
//         for(int i=0;i<ogSize;i++){
//             char ch1 = s.charAt(i);

//             if(p.indexOf(ch1) != -1){
//                 map.put(ch1,map.getOrDefault(ch1,0)+1);
//             }else{
//                 map.clear();
//                 j = i+1;
//             }

//             // abca a-2 not acceptable
//             while(i-j+1 > targetSize){
//                 char ch2 = s.charAt(j);
//                 map.put(ch2,map.get(ch2)-1);

//                 if(map.get(ch2) == 0 ) map.remove(ch2);

//                 j++;
//             }

//            if (i - j + 1 == targetSize && map.equals(targetMap)) {
//                 list.add(j);
//             }

//         }

//         return new ArrayList<>(list);

        
//     }
// }