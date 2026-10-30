class Solution {
    int bestCost;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        bestCost = baseCosts[0];

        for(int i=0;i<baseCosts.length;i++){
            generate(toppingCosts,0,baseCosts[i],target);
        }

        return bestCost;
    }

    public void generate(int [] toppingCosts,int index,int currCost, int target){
        if(index == toppingCosts.length){
            int currDiff = Math.abs(target - currCost);
            int bestDiff = Math.abs(target - bestCost);

            if(currDiff < bestDiff ||
                (currDiff == bestDiff && currCost < bestCost)) {
                    bestCost = currCost;
                
            }

            return;
        }

        // choose 0 cost
        generate(toppingCosts,index + 1,currCost,target);

        // choose 1 cost
        generate(toppingCosts,index + 1,currCost + toppingCosts[index],target);

        // choose 2 cost
        generate(toppingCosts,index + 1,currCost + (2*toppingCosts[index]),target);
    }
} 