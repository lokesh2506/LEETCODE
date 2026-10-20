import java.util.*;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> zero = new ArrayList<>();
        List<Integer> one = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<>();

        for (int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            // Make sure every winner is recorded.
            map.putIfAbsent(winner, 0);

            // Count losses.
            map.put(loser, map.getOrDefault(loser, 0) + 1);
        }

        for (int player : map.keySet()) {
            int losses = map.get(player);

            if (losses == 0) {
                zero.add(player);
            } else if (losses == 1) {
                one.add(player);
            }
        }

        Collections.sort(zero);
        Collections.sort(one);

        ans.add(zero);
        ans.add(one);

        return ans;
    }
}

// class Solution {
//     public List<List<Integer>> findWinners(int[][] matches) {
//         List<List<Integer>> ans = new ArrayList<>();

//         List<Integer> zero = new ArrayList<>();
//         List<Integer> one = new ArrayList<>();

//         Map<Integer,Integer> map = new HashMap<>();


//         for(int num[] : matches){
//             int winner = num[0];
//             int losser = num[1];

//             if(map.getOrDefault(winner,0) >= 0){
//                 map.put(winner,map.getOrDefault(winner,0)+1);
//                 if(!zero.contains(winner)){
//                     zero.add(winner);
//                 }
//             }

//             if(map.getOrDefault(losser,0) < 0){
//                 map.put(losser,map.getOrDefault(losser,0)-1);
//                 one.remove(Integer.valueOf(losser));
//             }else{
//                 map.put(losser,-1);
//                 if(zero.contains(losser)){
//                     zero.remove(Integer.valueOf(losser));
//                 } 

//                 one.add(losser);

//             }
//         }

//         Collections.sort(zero);
//         Collections.sort(one);

//         ans.add(zero);
//         ans.add(one);


//         return ans;

//     }
// }