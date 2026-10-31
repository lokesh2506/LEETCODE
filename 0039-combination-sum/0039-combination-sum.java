class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        solve(candidates,0,current,ans,target);

        return ans;
    }

    public void solve(int[] candidates, int index,List<Integer> current, List<List<Integer>> ans,int remaining){
        if(remaining == 0){
            ans.add(new ArrayList<>(current));
            return;
        }

        if(index == candidates.length){
            return;
        }

        // Pick: reuse the same element
        if(candidates[index] <= remaining){
            current.add(candidates[index]);
            solve(candidates,index,current,ans,remaining - candidates[index]);
            current.remove(current.size()-1);
        }

        // Not Pick: move to the next element
        solve(candidates,index+1,current,ans,remaining);
    }
}