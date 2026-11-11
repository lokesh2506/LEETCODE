class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(nums,0,curr,ans);

        return ans;
    }

    public void solve(int [] nums, int index, List<Integer> curr,List<List<Integer>> ans){
        if(curr.size() >= 2){
            ans.add(new ArrayList<>(curr));
        }

        if(index == nums.length){
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i=index;i<nums.length;i++){
            if(set.contains(nums[i])){
                continue;
            }

            if (!curr.isEmpty() && nums[i] < curr.get(curr.size() - 1)) {
                continue;
            }

            set.add(nums[i]);

            curr.add(nums[i]);
            solve(nums,i+1,curr,ans);
            curr.remove(curr.size() - 1);

        }
    }
}