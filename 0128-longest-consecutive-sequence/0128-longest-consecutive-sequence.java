class Solution {
    public int longestConsecutive(int[] nums) {
        // store all the nums in the set to remove the duplicate
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longest = 0;

        // count the length

        for(int num : set){
            // if you are 3  num-1 -> 2 // if i start from 3 -> 3 and 4 length 2 . so always start from less value becuase to reduce unwanted iteration

            if(!set.contains(num-1)){  // 4-1 -> 3 is available 
                int length = 1;

                while(set.contains(num+length)){
                    length++;
                }

                longest = Math.max(longest,length);
            }
        }

        return longest;
    }
}