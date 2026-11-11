class Solution {
    HashSet<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<Integer> curr = new ArrayList<>();
        solve(nums,0,curr);
        List<List<Integer>> ans = new ArrayList<>(set);


        return ans;
    }

    public void solve(int [] nums, int index, List<Integer> curr){
        if(curr.size() >= 2){
            set.add(new ArrayList<>(curr));
        }

        if(index == nums.length){
            return;
        }

        for(int i=index;i<nums.length;i++){
            // prev element should be less than the current element
            if (!curr.isEmpty() && nums[i] < curr.get(curr.size() - 1)) {
                continue;
            }

            curr.add(nums[i]);
            solve(nums,i+1,curr);
            curr.remove(curr.size() - 1);

        }
    }
}