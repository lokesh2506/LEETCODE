class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int losses [] = new int[100001];

        for(int match[] : matches){
            int win = match[0];
            int loss = match[1];

            if(losses[win] == 0){
                losses[win] = 1;
            }

            if(losses[loss] >= 0 ){ 
                // new loss and already win and now loss
                // 0 -> -1 ||  1 ->-1
                losses[loss] = -1;
            }else{
                losses[loss]--; //-2 -> -3
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < losses.length; i++){
            if(losses[i] == 1){
                zeroLoss.add(i);
            }else if(losses[i] == -1){
                oneLoss.add(i);
            }
        }

        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }
}