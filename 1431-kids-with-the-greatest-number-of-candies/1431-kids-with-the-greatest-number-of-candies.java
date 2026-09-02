class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> list = new LinkedList<>();

        int grtAmongKids = candies[0];

        for(int i=1;i<candies.length;i++){
            grtAmongKids = Math.max(grtAmongKids,candies[i]);
        }

        for(int i=0;i<candies.length;i++){
            if(grtAmongKids <= candies[i]+extraCandies){
                list.add(true);
            }else{
                list.add(false);
            }
        }

        return list;
    }
}