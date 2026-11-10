class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        Arrays.sort(candidates);

        solve(candidates,0,current,ans,target);

        return ans;
    }

    public void solve(int [] candidates,int index, List<Integer> current,List<List<Integer>> ans,int remaining){
        if(remaining == 0){
            ans.add(new ArrayList<>(current));
            return;
        }

        if(index == candidates.length){
            return;
        }


        // Not choose this
        int next = index + 1;
        while(next < candidates.length && 
            candidates[index] == candidates[next]){
            next++;
        }

        solve(candidates,next,current,ans,remaining);

        // choose this and move to the next element
        if(candidates[index] <= remaining){
            current.add(candidates[index]);
            solve(candidates,index+1,current,ans,remaining - candidates[index]);
            current.remove(current.size() - 1);
        }
    }
}