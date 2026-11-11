class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        if(k > n){
            return ans;
        }

        int [] nums = new int[9];
        for(int i=0;i<9;i++){
            nums[i] = i+1;
        }

        solve(nums,0,k,n,curr,ans);

        return ans;
    }

    public void solve(int [] nums,int index,int k, int remaining, List<Integer> curr,List<List<Integer>> ans){
        if(remaining == 0 && curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(index == nums.length || curr.size() >= k){
            return;
        }

        // not choose this
        solve(nums,index+1,k,remaining,curr,ans);


        // choose this 
        if(nums[index] <= remaining){
            curr.add(nums[index]);
            solve(nums,index+1,k,remaining - nums[index],curr,ans);
            curr.remove(curr.size() - 1);
        }
    }
}