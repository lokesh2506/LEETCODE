class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ans = new HashMap<>();

        for(String str : strs){
            int charArr[] = new int[26];

            for(char ch:str.toCharArray()){
                charArr[ch-'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int num: charArr){
                sb.append(num).append("$"); // add any special key
            }

            String key = sb.toString();

            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }

            ans.get(key).add(str);
        }

        return new ArrayList<>(ans.values());
    }
}