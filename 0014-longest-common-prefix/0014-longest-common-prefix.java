class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        if(size == 0) return "";

        if(size == 1) return strs[0];
        // sort the array .so it will sorted based on the each leeter in the words
        // ["flower","flow","flight"] -> ["flight","flow","flower",]

        Arrays.sort(strs);

        int minSize = Math.min(strs[0].length(),strs[size-1].length());

        int i =0;
        while(i<minSize){
            if(strs[0].charAt(i) != strs[size-1].charAt(i)){
                return strs[0].substring(0,i);
            }
            i++;
        }

        return strs[0].substring(0,i);

    }
}